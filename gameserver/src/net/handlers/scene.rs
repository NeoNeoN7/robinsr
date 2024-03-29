use super::*;

pub async fn on_get_cur_scene_info_cs_req(
    session: &mut PlayerSession,
    _body: &GetCurSceneInfoCsReq,
) -> Result<()> {
    session
        .send(
            CMD_GET_CUR_SCENE_INFO_SC_RSP,
            GetCurSceneInfoScRsp {
                retcode: 0,
                scene: Some(SceneInfo {
                    plane_id: 20101,
                    floor_id: 20101001,
                    entry_id: 2010101,
                    game_mode_type: 2,
                    chhmmbdhjpg: vec![
                        Dhkacjhaoid {
                            state: 1,
                            group_id: 0,
                            entity_list: vec![SceneEntityInfo {
                                group_id: 0,
                                inst_id: 0,
                                entity_id: 0,
                                actor: Some(SceneActorInfo {
                                    avatar_type: 3,
                                    base_avatar_id: 1309,
                                    map_layer: 2,
                                    uid: 1337,
                                }),
                                motion: Some(MotionInfo {
                                    aomilajjmii: Some(Vector {
                                        bagloppgnpb: 4480,
                                        bemlopmcgch: 19364,
                                        baimdminomk: -550,
                                    }),
                                    eiaoiankefd: Some(Vector {
                                        bagloppgnpb: 4480,
                                        bemlopmcgch: 19364,
                                        baimdminomk: -550,
                                    }),
                                }),
                                ..Default::default()
                            }],
                        },
                        Dhkacjhaoid {
                            state: 1,
                            group_id: 19,
                            entity_list: vec![SceneEntityInfo {
                                group_id: 19,
                                inst_id: 300001,
                                entity_id: 228,
                                prop: Some(ScenePropInfo {
                                    prop_id: 808,
                                    prop_state: 1,
                                    ..Default::default()
                                }),
                                motion: Some(MotionInfo {
                                    aomilajjmii: Some(Vector {
                                        bagloppgnpb: 4480,
                                        bemlopmcgch: 19364,
                                        baimdminomk: -570,
                                    }),
                                    eiaoiankefd: Some(Vector {
                                        bagloppgnpb: 4480,
                                        bemlopmcgch: 19364,
                                        baimdminomk: -570,
                                    }),
                                }),
                                ..Default::default()
                            }],
                        },
                    ],
                    ..Default::default()
                }),
            },
        )
        .await
}
