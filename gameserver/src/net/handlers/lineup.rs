use super::*;

static STARTING_LINEUP: [u32; 4] = [1309, 1308, 1307, 1315];

pub async fn on_get_all_lineup_data_cs_req(
    session: &mut PlayerSession,
    _body: &GetAllLineupDataCsReq,
) -> Result<()> {
    session
        .send(
            CMD_GET_ALL_LINEUP_DATA_SC_RSP,
            GetAllLineupDataScRsp {
                retcode: 0,
                cur_index: 0,
                lineup_list: vec![LineupInfo {
                    plane_id: 10001,
                    name: String::from("Lineup 1"),
                    index: 0,
                    avatar_list: STARTING_LINEUP
                        .iter()
                        .enumerate()
                        .map(|(idx, id)| LineupAvatar {
                            id: *id,
                            slot: idx as u32,
                            hp: 10000,
                            sp: Some(AmountInfo {
                                cur_amount: 10000,
                                max_amount: 10000,
                            }),
                            satiety: 100,
                            avatar_type: 3,
                        })
                        .collect(),
                    ..Default::default()
                }],
            },
        )
        .await
}

pub async fn on_get_cur_lineup_data_cs_req(
    session: &mut PlayerSession,
    _body: &GetCurLineupDataCsReq,
) -> Result<()> {
    session
        .send(
            CMD_GET_CUR_LINEUP_DATA_SC_RSP,
            GetCurLineupDataScRsp {
                retcode: 0,
                lineup: Some(LineupInfo {
                    plane_id: 10001,
                    name: String::from("Lineup 1"),
                    index: 0,
                    avatar_list: STARTING_LINEUP
                        .iter()
                        .enumerate()
                        .map(|(idx, id)| LineupAvatar {
                            id: *id,
                            slot: idx as u32,
                            hp: 10000,
                            sp: Some(AmountInfo {
                                cur_amount: 10000,
                                max_amount: 10000,
                            }),
                            satiety: 100,
                            avatar_type: 3,
                        })
                        .collect(),
                    ..Default::default()
                }),
            },
        )
        .await
}

pub async fn on_change_lineup_leader_cs_req(
    session: &mut PlayerSession,
    body: &ChangeLineupLeaderCsReq,
) -> Result<()> {
    session
        .send(
            CMD_CHANGE_LINEUP_LEADER_SC_RSP,
            ChangeLineupLeaderScRsp {
                slot: body.slot,
                retcode: 0,
            },
        )
        .await
}
