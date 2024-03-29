use lazy_static::lazy_static;
use prost::Message;
use rand::Rng;
use tokio::sync::Mutex;

use crate::{net::{tools::{AvatarJson, JsonData}, tools_res::PropState}, util};

use super::*;

#[derive(Message)]
struct Dummy {

}

pub async fn on_get_cur_scene_info_cs_req(
    session: &mut PlayerSession,
    _body: &GetCurSceneInfoCsReq,
) -> Result<()> {
    let mut player = JsonData::load().await;
    let entry = player.scene.entry_id.clone();

    let scene = load_scene(session, &mut player, entry, false, Option::<u32>::None).await;

    let resp = GetCurSceneInfoScRsp {
        retcode: 0,
        scene: if let Ok(scene) = scene {
            Some(scene)
        } else {
            Some(SceneInfo {
                game_mode_type: 1,
                entry_id: player.scene.entry_id,
                plane_id: player.scene.plane_id,
                floor_id: player.scene.floor_id,
                ..Default::default()
            })
        },
    };

    session.send(CMD_GET_CUR_SCENE_INFO_SC_RSP, resp).await?;
    if !player.position.is_empty() {
        session
            .send(
                CMD_SCENE_ENTITY_MOVE_SC_NOTIFY,
                SceneEntityMoveScNotify {
                    entity_id: 0,
                    entry_id: player.scene.entry_id,
                    motion: Some(player.position.to_motion()),
                    ..Default::default()
                },
            )
            .await?;
    };

    Ok(())
}

// enterscene
pub async fn on_lckgkdehclb(session: &mut PlayerSession, request: &Lckgkdehclb) -> Result<()> {
    let mut player = JsonData::load().await;

    // send packet first
    session
        .send(CMD_ENTER_SCENE_SC_RSP, Dummy::default())
        .await?;

    let _ = load_scene(session, &mut player, request.entry_id, true, Some(request.maplanefddc)).await;


    Ok(())
}

// getscenemapinfocsreq
pub async fn on_fkjoeabiioe(sesison: &mut PlayerSession, request: &Fkjoeabiioe) -> Result<()> {
    let player = JsonData::load().await;

    let back = vec![
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
        26, 27, 28, 29, 30, 31, 32, 33, 34, 0,
    ];

    let mut map_info = Fjniajephmj {
        retcode: 0,
        // lighten section list
        phicefeaigb: back.clone(),
        // maze chest
        dcbdhkkkpgd: vec![
            Gbiimoglajl {
                gommoeicmjg: Kihbdaniehp::MapInfoChestTypeNormal.into(),
                ..Default::default()
            },
            Gbiimoglajl {
                gommoeicmjg: Kihbdaniehp::MapInfoChestTypePuzzle.into(),
                ..Default::default()
            },
            Gbiimoglajl {
                gommoeicmjg: Kihbdaniehp::MapInfoChestTypeChallenge.into(),
                ..Default::default()
            },
        ],

        ..Default::default()
    };

    if let Some((level, enterance, _)) = player
        .get_level_group(request.dmkkkfnkofh[0])
        .await
    {
        // add teleports
        for teleport in &level.teleports {
            map_info.ojlnmnehgai.push(*teleport.0)
        }

        // prop
        for prop in &level.props {
            let group = Gecjjlmabhp {
                group_id: prop.group_id,
                ..Default::default()
            };
            if !map_info.pmolfbcbfpe.contains(&group) {
                map_info.pmolfbcbfpe.push(group);
            }

            map_info.cgkfbhoadpc.push(Kangcibfhee {
                group_id: prop.group_id,
                state: if prop.prop_state_list.contains(&PropState::CheckPointEnable) {
                    PropState::CheckPointEnable as u32
                } else {
                    (prop.prop_state_list.first().unwrap_or(&PropState::Closed)).clone() as u32
                },
                ifjocipnpgd: prop.id as u32,
            });
        }

        map_info.entry_id = enterance.id;
    }
    sesison.send(
        CMD_GET_SCENE_MAP_INFO_SC_RSP,
        Cegeebldbke {
            retcode: 0,
            mhefdgcamjl: vec![map_info],
            ..Default::default()
        },
    )
    .await?;

    Ok(())
}

lazy_static! {
    static ref NEXT_SCENE_SAVE: Mutex<u64> = Mutex::new(0);
}

pub async fn on_scene_entity_move_cs_req(session: &mut PlayerSession, request: &SceneEntityMoveCsReq) -> Result<()> {
    let mut player = JsonData::load().await;
    let mut timestamp = NEXT_SCENE_SAVE.lock().await;

    if util::cur_timestamp_ms() <= *timestamp {
        session
        .send(CMD_SCENE_ENTITY_MOVE_SC_RSP, Dummy::default())
        .await?;

        return Ok(());
    }
    
    // save every 5 minute
    *timestamp = util::cur_timestamp_ms() + (5 * 1000);
    
    for entity in &request.entity_motion_list {
        if entity.entity_id != 0 {
            continue;
        }

        if let Some(motion) = &entity.motion {
            if let Some(pos) = &motion.aomilajjmii {
                player.position.x = pos.baimdminomk;
                player.position.y = pos.bemlopmcgch;
                player.position.z = pos.bagloppgnpb;
            }
            if let Some(rot) = &motion.eiaoiankefd {
                player.position.rot_y = rot.bemlopmcgch;
            }
        }
    }

    player.save().await;
    session
        .send(CMD_SCENE_ENTITY_MOVE_SC_RSP, Dummy::default())
        .await?;

    Ok(())
}

async fn load_scene(
    session: &mut PlayerSession,
    json: &mut JsonData,
    entry_id: u32,
    _save: bool,
    teleport_id: Option<u32>,
) -> Result<SceneInfo> {
    if let Some((level, enterance, plane)) = json.get_level_group( entry_id).await {
        let mut position = json.position.clone();
        if let Some(teleport_id) = teleport_id {
            if let Some(teleport) = level.teleports.get(&teleport_id) {
                position.x = (teleport.pos_x * 1000f64) as i32;
                position.y = (teleport.pos_y * 1000f64) as i32;
                position.z = (teleport.pos_z * 1000f64) as i32;
                position.rot_y = (teleport.rot_y * 1000f64) as i32;
            }
        }

        let mut scene_info = SceneInfo {
            floor_id: enterance.floor_id as u32,
            plane_id: enterance.plane_id as u32,
            entry_id,
            game_mode_type: plane
                .as_ref()
                .map(|v| v.plane_type)
                .unwrap_or(enterance.entrance_type) as u32,

            // world_id: plane.map(|v| v.world_id).unwrap_or_default(),
            ..Default::default()
        };

        let lineup_info = AvatarJson::to_lineup_info(&json.lineups);
        let player_pos = MotionInfo {
            // rot
            eiaoiankefd: Some(Vector {
                baimdminomk:0,
                bemlopmcgch: position.rot_y,
                bagloppgnpb: 0,
            }),
            // pos
            aomilajjmii: Some(Vector {
                baimdminomk: position.x,
                bemlopmcgch: position.y,
                bagloppgnpb: position.z,
            }),
        };

        let mut entities = 0;

        // LOAD PROPS
        for prop in level.props {
            if entities >= 500 {
                continue;
            }
            entities += 1;

            let mut rng = rand::thread_rng();

            let prop_state = if prop.anchor_id.unwrap_or_default() > 0 {
                8
            } else {
                prop.prop_state_list.first().unwrap().clone() as u32
            };
            let info = SceneEntityInfo {
                inst_id: prop.id as u32,
                group_id: prop.group_id,
                entity_id: rng.gen(),
                motion: Some(MotionInfo {
                    // pos
                    aomilajjmii: Some(Vector {
                        baimdminomk: (prop.pos_x * 1000f64) as i32,
                        bemlopmcgch: (prop.pos_y * 1000f64) as i32,
                        bagloppgnpb: (prop.pos_z * 1000f64) as i32,
                    }),
                    // rot
                    eiaoiankefd: Some(Vector {
                        baimdminomk: 0,
                        bemlopmcgch: (prop.rot_y * 1000f64) as i32,
                        bagloppgnpb: 0,
                    }),
                }),
                prop: Some(ScenePropInfo {
                    prop_id: prop.prop_id as u32,
                    prop_state: prop_state,
                    ..Default::default()
                }),
                ..Default::default()
            };

            // only add check
            // if prop_state == 8 {
            //     group_info.entity_list.push(info);
            // }
            if let Some(group) = scene_info
                .chhmmbdhjpg
                .iter_mut()
                .find(|v| v.group_id == prop.group_id)
            {
                group.entity_list.push(info)
            } else {
                let mut group_info = Dhkacjhaoid {
                    state: 0,
                    group_id: prop.group_id,
                    ..Default::default()
                };
                group_info.entity_list.push(info);
                scene_info.chhmmbdhjpg.push(group_info);
            }
        }

        // LOAD MONSTERS
        for monster in level.monsters {
            if entities >= 500 {
                continue;
            }
            entities += 1;

            let mut rng = rand::thread_rng();

            let info = SceneEntityInfo {
                inst_id: monster.id as u32,
                group_id: monster.group_id,
                entity_id: rng.gen(),
                motion: Some(MotionInfo {
                    // pos
                    aomilajjmii: Some(Vector {
                        baimdminomk: (monster.pos_x * 1000f64) as i32,
                        bemlopmcgch: (monster.pos_y * 1000f64) as i32,
                        bagloppgnpb: (monster.pos_z * 1000f64) as i32,
                    }),
                    // rot
                    eiaoiankefd: Some(Vector {
                        baimdminomk: 0,
                        bemlopmcgch: (monster.rot_y * 1000f64) as i32,
                        bagloppgnpb: 0,
                    }),
                }),
                npc_monster: Some(SceneNpcMonsterInfo {
                    monster_id: monster.npcmonster_id as u32,
                    event_id: monster.event_id as u32,
                    world_level: 6,
                    ..Default::default()
                }),
                ..Default::default()
            };

            if let Some(group) = scene_info
                .chhmmbdhjpg
                .iter_mut()
                .find(|v| v.group_id == monster.group_id)
            {
                group.entity_list.push(info)
            } else {
                let mut group_info = Dhkacjhaoid {
                    state: 0,
                    group_id: monster.group_id,
                    ..Default::default()
                };
                group_info.entity_list.push(info);
                scene_info.chhmmbdhjpg.push(group_info);
            }
        }

        if _save {
            session
                .send(
                    CMD_ENTER_SCENE_BY_SERVER_SC_NOTIFY,
                    Jdokmmikidp {
                        scene: Some(scene_info.clone()),
                        lineup: Some(lineup_info),
                        ..Default::default()
                    },
                )
                .await?;

            session
                .send(
                    CMD_SCENE_ENTITY_MOVE_SC_NOTIFY,
                    SceneEntityMoveScNotify {
                        entity_id: 0,
                        entry_id: entry_id,
                        motion: Some(player_pos),
                        ..Default::default()
                    },
                )
                .await?;

            json.scene.entry_id = entry_id;
            json.scene.floor_id = enterance.floor_id as u32;
            json.scene.plane_id = enterance.plane_id as u32;
            json.position.x = position.x;
            json.position.y = position.y;
            json.position.z = position.z;
            json.position.rot_y = position.rot_y;
            json.save().await;
        }

        return Ok(scene_info);
    }

    Err(anyhow::format_err!("Scene Not Found"))
}
