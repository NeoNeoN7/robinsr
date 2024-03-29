use super::*;

static TUTORIAL_IDS: [u32; 55] = [
    1001, 1002, 1003, 1004, 1005, 1007, 1008, 1010, 1011, 2001, 2002, 2003, 2004, 2005, 2008, 2009,
    2010, 2011, 2012, 2013, 2014, 2015, 3001, 3002, 3003, 3004, 3005, 3006, 4002, 4003, 4004, 4005,
    4006, 4007, 4008, 4009, 5001, 5002, 5003, 5004, 5005, 5006, 5007, 5008, 5009, 5010, 5011, 5012,
    7001, 9001, 9002, 9003, 9004, 9005, 9006,
];

pub async fn on_get_tutorial_cs_req(
    session: &mut PlayerSession,
    _body: &GetTutorialCsReq,
) -> Result<()> {
    session
        .send(
            CMD_GET_TUTORIAL_SC_RSP,
            GetTutorialScRsp {
                retcode: 0,
                tutorial_list: TUTORIAL_IDS
                    .iter()
                    .map(|id| Tutorial {
                        id: *id,
                        status: TutorialStatus::TutorialFinish.into(),
                    })
                    .collect(),
            },
        )
        .await
}

pub async fn on_get_tutorial_guide_cs_req(
    session: &mut PlayerSession,
    _body: &GetTutorialGuideCsReq,
) -> Result<()> {
    session
        .send(
            CMD_GET_TUTORIAL_GUIDE_SC_RSP,
            GetTutorialGuideScRsp {
                retcode: 0,
                tutorial_guide_list: vec![],
            },
        )
        .await
}

pub async fn on_unlock_tutorial_guide_cs_req(
    session: &mut PlayerSession,
    body: &UnlockTutorialGuideCsReq,
) -> Result<()> {
    session
        .send(
            CMD_UNLOCK_TUTORIAL_GUIDE_SC_RSP,
            UnlockTutorialGuideScRsp {
                retcode: 0,
                tutorial_guide: Some(TutorialGuide {
                    id: body.group_id,
                    status: TutorialStatus::TutorialUnlock.into(),
                }),
            },
        )
        .await
}
