use super::*;

static BATTLE_LINEUP: [u32; 4] = [1309, 1308, 1307, 1315];

pub async fn on_start_cocoon_stage_cs_req(
    session: &mut PlayerSession,
    body: &StartCocoonStageCsReq,
) -> Result<()> {
    let rsp = StartCocoonStageScRsp {
        retcode: 0,
        prop_entity_id: body.prop_entity_id,
        cocoon_id: body.cocoon_id,
        wave: body.wave,
        battle_info: Some(SceneBattleInfo {
            stage_id: 201012311,
            logic_random_seed: 4444,
            battle_id: 1,
            battle_avatar_list: BATTLE_LINEUP
                .iter()
                .enumerate()
                .map(|(idx, id)| BattleAvatar {
                    index: idx as u32,
                    id: *id,
                    level: 80,
                    promotion: 6,
                    rank: 6,
                    hp: 10000,
                    avatar_type: 3,
                    sp: Some(AmountInfo {
                        cur_amount: 10000,
                        max_amount: 10000,
                    }),
                    ..Default::default()
                })
                .collect(),
            monster_wave_list: vec![SceneMonsterWave {
                monster_list: vec![SceneMonsterParam {
                    monster_id: 3013010,
                    ..Default::default()
                }],
                ..Default::default()
            }],
            ..Default::default()
        }),
    };

    session.send(CMD_START_COCOON_STAGE_SC_RSP, rsp).await
}

pub async fn on_pve_battle_result_cs_req(
    session: &mut PlayerSession,
    body: &PveBattleResultCsReq,
) -> Result<()> {
    session
        .send(
            CMD_P_V_E_BATTLE_RESULT_SC_RSP,
            PveBattleResultScRsp {
                retcode: 0,
                end_status: body.end_status,
                battle_id: body.battle_id,
                ..Default::default()
            },
        )
        .await
}
