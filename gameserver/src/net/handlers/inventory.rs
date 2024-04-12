use anyhow::Result;
use proto::*;

use crate::net::{tools::JsonData, PlayerSession};

use super::Dummy;

pub async fn on_get_bag_cs_req(session: &mut PlayerSession, _: &GetBagCsReq) -> Result<()> {
    let player = JsonData::load().await;

    session
        .send(
            CMD_GET_BAG_SC_RSP,
            GetBagScRsp {
                equipment_list: player
                    .lightcones
                    .iter()
                    .map(|v| v.to_equipment_proto())
                    .collect(),
                relic_list: player.relics.iter().map(|v| v.to_relic_proto()).collect(),
                ..Default::default()
            },
        )
        .await
}

pub async fn on_get_archive_data_cs_req(
    session: &mut PlayerSession,
    _: &GetArchiveDataCsReq,
) -> Result<()> {
    session
        .send(
            CMD_GET_ARCHIVE_DATA_SC_RSP,
            GetArchiveDataScRsp {
                archive_data: Some(ArchiveData::default()),
                retcode: 0,
            },
        )
        .await
}

pub async fn on_oakankcfbec(session: &mut PlayerSession, _: &Oakankcfbec) -> Result<()> {
    // ?
    session
        .send(CMD_DRESS_RELIC_AVATAR_SC_RSP, Dummy::default())
        .await
}

pub async fn on_cnpajjnhfpa(session: &mut PlayerSession, _: &Cnpajjnhfpa) -> Result<()> {
    // ?
    session
        .send(CMD_TAKE_OFF_RELIC_SC_RSP, Dummy::default())
        .await
}

pub async fn on_copkgioejac(session: &mut PlayerSession, _: &Copkgioejac) -> Result<()> {
    // ?
    session
        .send(CMD_DRESS_AVATAR_SC_RSP, Dummy::default())
        .await
}

pub async fn on_aafgmacgenl(session: &mut PlayerSession, _: &Aafgmacgenl) -> Result<()> {
    // ?
    session
        .send(CMD_TAKE_OFF_EQUIPMENT_SC_RSP, Dummy::default())
        .await
}
