mod authentication;
mod avatar;
mod battle;
mod lineup;
mod mission;
mod player;
mod scene;
mod tutorial;
mod inventory;

use anyhow::Result;
use paste::paste;
use proto::*;
use tokio::io::AsyncWriteExt;

use super::PlayerSession;
use crate::net::NetPacket;

pub use authentication::*;
pub use avatar::*;
pub use battle::*;
pub use lineup::*;
pub use mission::*;
pub use player::*;
pub use scene::*;
pub use tutorial::*;
pub use inventory::*;

use proto::{
    Aaihejacdpk::*, Achkcddkkkj::*, Bancodieeof::*, CmdActivityType::*, CmdBattleType::*,
    CmdPlayerType::*, Cmpepmnekko::*, Cpbdjpocnai::*, Ddhbjcelmjp::*,
    Eegmjpcijbc::*, Emhbkpkpjpa::*, Fdkapmfjgjl::*, Gaifgoihffa::*, Galijhmhgcg::*, Gdjpnkniijf::*,
    Hfjpennlffa::*, Hmnbojnkleh::*, Ieoildlcdkb::*, Kfmpmaojchm::*, Lopidcokdih::*, Lpegmiilfjm::*,
    Mbnnmfkffbo::*, Mkeclbphcol::*, Niinikapdpg::*, Pfokmnnfiap::*, Pjmghcfmmge::*, Pnjfenbhbhg::*,
    Pnnbhogkeeh::*,
};

macro_rules! dummy {
    ($($cmd:ident),* $(,)*) => {
        paste! {
            impl PlayerSession {
                pub const fn should_send_dummy_rsp(cmd_id: u16) -> bool {
                    match cmd_id {
                        $(
                            x if x == [<Cmd $cmd CsReq>] as u16 => true,
                        )*
                        _ => false,
                    }
                }

                pub async fn send_dummy_response(&mut self, req_id: u16) -> Result<()> {
                    let cmd_type = match req_id {
                        $(
                            x if x == [<Cmd $cmd CsReq>] as u16 => [<Cmd $cmd ScRsp>] as u16,
                        )*
                        _ => return Err(anyhow::anyhow!("Invalid request id {req_id:?}")),
                    };

                    let payload: Vec<u8> = NetPacket {
                        cmd_type,
                        head: Vec::new(),
                        body: Vec::new(),
                    }
                    .into();

                    self.client_socket.write_all(&payload).await?;

                    Ok(())
                }
            }
        }
    };
}

dummy! {
    // SceneEntityMove,
    GetLevelRewardTakenList,
    GetRogueScoreRewardInfo,
    GetGachaInfo,
    QueryProductInfo,
    GetQuestData,
    GetQuestRecord,
    GetFriendListInfo,
    GetFriendApplyListInfo,
    GetCurAssist,
    GetRogueHandbookData,
    GetDailyActiveInfo,
    GetFightActivityData,
    GetMultipleDropInfo,
    GetPlayerReturnMultiDropInfo,
    GetShareData,
    GetTreasureDungeonActivityData,
    PlayerReturnInfoQuery,
    // GetBag,
    GetPlayerBoardData,
    GetActivityScheduleConfig,
    GetMissionData,
    GetMissionEventData,
    GetChallenge,
    GetCurChallenge,
    GetRogueInfo,
    GetExpeditionData,
    GetRogueDialogueEventData,
    GetJukeboxData,
    SyncClientResVersion,
    DailyFirstMeetPam,
    GetMuseumInfo,
    GetLoginActivity,
    GetRaidInfo,
    GetTrialActivityData,
    GetBoxingClubInfo,
    GetNpcStatus,
    TextJoinQuery,
    GetSpringRecoverData,
    GetChatFriendHistory,
    GetSecretKeyInfo,
    GetVideoVersionKey,
    GetCurBattleInfo,
    GetPhoneData,
    PlayerLoginFinish,
}
