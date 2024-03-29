use anyhow::Result;
use proto::*;

use crate::{net::PlayerSession, util};

pub async fn on_player_get_token_cs_req(
    session: &mut PlayerSession,
    _body: &PlayerGetTokenCsReq,
) -> Result<()> {
    session
        .send(
            CMD_PLAYER_GET_TOKEN_SC_RSP,
            PlayerGetTokenScRsp {
                retcode: 0,
                msg: String::from("OK"),
                uid: 1337,
                ..Default::default()
            },
        )
        .await
}

pub async fn on_player_login_cs_req(
    session: &mut PlayerSession,
    body: &PlayerLoginCsReq,
) -> Result<()> {
    session
        .send(
            CMD_PLAYER_LOGIN_SC_RSP,
            PlayerLoginScRsp {
                login_random: body.login_random,
                server_timestamp_ms: util::cur_timestamp_ms(),
                stamina: 240,
                basic_info: Some(PlayerBasicInfo {
                    nickname: String::from("xeondev"),
                    level: 5,
                    stamina: 240,
                    ..Default::default()
                }),
                ..Default::default()
            },
        )
        .await
}
