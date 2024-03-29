use proto::{Avatar, AvatarSkillTree, BattleAvatar};
use serde::{Deserialize, Serialize};
use std::collections::{BTreeMap, HashMap};
use proto::*;

use super::tools_res::{MapEntrance, MazePlane, SimpleLevelGroup, GAME_RESOURCES};

// AVATAR
#[derive(Serialize, Deserialize, Debug, Clone)]
pub struct AvatarJson {
    #[serde(alias = "ownerUid")]
    pub owner_uid: u32,
    #[serde(alias = "avatarId")]
    pub avatar_id: u32,
    pub data: AvatarData,
    pub level: u32,
    pub promotion: u32,
    // pub rank: u32,
    #[serde(alias = "use_technique")]
    #[serde(alias = "useTechnique")]
    pub techniques: Vec<u32>,
    #[serde(alias = "spValue")]
    pub sp_value: Option<u32>,
    #[serde(alias = "spMax")]
    pub sp_max: Option<u32>,
}

#[derive(Serialize, Deserialize, Debug, Clone)]
pub struct AvatarData {
    pub rank: u32,
    pub skills: BTreeMap<u32, u32>,
}

#[allow(dead_code)]
impl AvatarJson {
    pub fn to_avatar_proto(
        &self,
        lightcone: Option<&Lightcone>,
        relics: Vec<&Relic>,
    ) -> Avatar {
        Avatar {
            base_avatar_id: self.avatar_id,
            exp: 0,
            level: self.level,
            promotion: self.promotion,
            rank: self.data.rank,
            skilltree_list: self
                .data
                .skills
                .iter()
                .map(|v| AvatarSkillTree {
                    point_id: *v.0,
                    level: *v.1,
                })
                .collect::<Vec<_>>(),
            equipment_unique_id: if let Some(lc) = lightcone {
                lc.internal_uid
            } else {
                0
            },
            amafpakcckf: relics
                .iter()
                .map(|v| v.to_equipment_relic_proto())
                .collect::<Vec<_>>(),
            ..Default::default()
        }
    }

    pub fn to_battle_avatar_proto(
        &self,
        index: u32,
        lightcone: Option<&Lightcone>,
        relics: Vec<&Relic>,
    ) -> (BattleAvatar, Vec<BattleBuff>) {
        let battle_avatar = BattleAvatar {
            index,
            avatar_type: AvatarType::AvatarFormalType.into(),
            id: self.avatar_id,
            level: self.level,
            rank: self.data.rank,
            skilltree_list: self
                .data
                .skills
                .iter()
                .map(|v| AvatarSkillTree {
                    point_id: *v.0,
                    level: *v.1,
                })
                .collect::<Vec<_>>(),
            equipment_list: if let Some(lc) = lightcone {
                vec![lc.to_battle_equipment_proto()]
            } else {
                vec![]
            },
            hp: 10_000,
            promotion: self.promotion,
            relic_list: relics
                .iter()
                .map(|v| v.to_battle_relic_proto())
                .collect::<Vec<_>>(),
            world_level: 6,
            sp: Some(AmountInfo {
                cur_amount: self.sp_value.unwrap_or(10_000),
                max_amount: self.sp_max.unwrap_or(10_000),
            }),
            ..Default::default()
        };

        let mut battle_buff = Vec::<BattleBuff>::new();
        for buff_id in &self.techniques {
            battle_buff.push(BattleBuff {
                wave_flag: 0xffffffff,
                owner_index: index as u32,
                level: 1,
                id: *buff_id,
                ..Default::default()
            });
        }

        (battle_avatar, battle_buff)
    }

    pub fn to_lineup_avatar_proto(&self, slot: u32) -> LineupAvatar {
        LineupAvatar {
            id: self.avatar_id,
            hp: 10_000,
            satiety: 100,
            avatar_type: AvatarType::AvatarFormalType.into(),
            sp: Some(AmountInfo {
                cur_amount: self.sp_value.unwrap_or(10_000),
                max_amount: self.sp_max.unwrap_or(10_000),
            }),
            slot,
        }
    }

    pub fn to_lineup_avatars(
        player: &JsonData,
    ) -> Vec<LineupAvatar> {
        let avatar_ids = player.avatars.iter().map(|(_, v)| &v.avatar_id).collect::<Vec<_>>();

        player.lineups
            .iter()
            .filter(|(_slot, v)| v > &&0 && avatar_ids.contains(v))
            .map(|(slot, avatar_id)| {
                player.avatars
                    .get(avatar_id)
                    .unwrap()
                    .to_lineup_avatar_proto(*slot)
            })
            .collect::<Vec<LineupAvatar>>()
    }

    pub fn to_lineup_info(lineups: &BTreeMap<u32, u32>) -> LineupInfo {
        let mut lineup_info = LineupInfo {
            extra_lineup_type: ExtraLineupType::LineupNone.into(),
            name: "Squad 1".to_string(),
            // mp: 5,
            // leader_slot: 0,
            // max_mp: 5,
            ..Default::default()
        };

        for (_, id) in lineups {
            if *id == 0 {
                continue;
            }
            lineup_info.avatar_list.push(LineupAvatar {
                id: *id,
                hp: 10_000,
                satiety: 100,
                avatar_type: AvatarType::AvatarFormalType.into(),
                sp: Some(AmountInfo {
                    cur_amount: 10_000,
                    max_amount: 10_000,
                }),
                slot: lineup_info.avatar_list.len() as u32,
            });
        }

        lineup_info
    }
}


// LIGHTCONE
#[derive(Serialize, Deserialize, Debug, Clone)]
pub struct Lightcone {
    pub level: u32,
    #[serde(alias = "itemId")]
    pub item_id: u32,
    #[serde(alias = "equipAvatar")]
    pub equip_avatar: u32,
    pub rank: u32,
    pub promotion: u32,
    #[serde(alias = "internalUid")]
    pub internal_uid: u32,
}

#[allow(dead_code)]
impl Lightcone {
    pub fn to_equipment_proto(&self) -> Equipment {
        Equipment {
            base_avatar_id: self.equip_avatar,
            exp: 0,
            is_protected: false,
            level: self.level,
            promotion: self.promotion,
            rank: self.rank,
            tid: self.item_id,
            unique_id: self.internal_uid,
            ..Default::default()
        }
    }

    pub fn to_battle_equipment_proto(&self) -> BattleEquipment {
        BattleEquipment {
            id: self.item_id,
            level: self.level,
            promotion: self.promotion,
            rank: self.rank,
        }
    }
}


// RELIC
#[derive(Debug, Serialize, Deserialize, Clone)]
pub struct Relic {
    pub level: u32,
    #[serde(alias = "relicId")]
    pub relic_id: u32,
    #[serde(alias = "relicSetId")]
    pub relic_set_id: u32,
    #[serde(alias = "mainAffixId")]
    pub main_affix_id: u32,
    #[serde(alias = "subAffixes")]
    pub sub_affixes: Vec<SubAffix>,
    #[serde(alias = "internalUid")]
    pub internal_uid: u32,
    #[serde(alias = "equipAvatar")]
    pub equip_avatar: u32,
}

#[derive(Debug, Serialize, Deserialize, Default, Clone)]
pub struct SubAffix {
    #[serde(alias = "subAffixId")]
    pub sub_affix_id: u32,
    pub count: u32,
    pub step: u32,
}

#[allow(dead_code)]
impl Relic {
    pub fn to_relic_proto(&self) -> proto::Relic {
        proto::Relic {
            base_avatar_id: self.equip_avatar,
            exp: 0,
            is_protected: false,
            level: self.level,
            main_affix_id: self.main_affix_id,
            tid: self.relic_id,
            unique_id: self.internal_uid,
            sub_affix_list: self
                .sub_affixes
                .iter()
                .map(|v| RelicAffix {
                    affix_id: v.sub_affix_id,
                    cnt: v.count,
                    step: v.step,
                })
                .collect::<Vec<_>>(),
           ..Default::default()
        }
    }

    pub fn to_battle_relic_proto(&self) -> BattleRelic {
        BattleRelic {
            id: self.relic_id,
            level: self.level,
            main_affix_id: self.main_affix_id,
            unique_id: self.internal_uid,
            sub_affix_list: self
                .sub_affixes
                .iter()
                .map(|v| RelicAffix {
                    affix_id: v.sub_affix_id,
                    cnt: v.count,
                    step: v.step,
                })
                .collect::<Vec<_>>(),
                ..Default::default()
        }
    }

    pub fn to_equipment_relic_proto(&self) -> EquipRelic {
        EquipRelic {
            ipnhjoomhdm: 0, //slot
            llepdadmfdo: self.internal_uid,
        }
    }
}


// MONSTER
#[derive(Debug, Serialize, Deserialize, Clone, Default)]
pub struct Monster {
    pub level: u32,
    #[serde(alias = "monsterId")]
    pub monster_id: u32,
    #[serde(default)]
    pub max_hp: u32,
}

#[allow(dead_code)]
impl Monster {
    fn to_scene_monster_info(&self) -> SceneMonsterParam {
        SceneMonsterParam {
            monster_id: self.monster_id,
            max_hp: self.max_hp,
            aiapcboelmg: self.max_hp,
        }
    }

    pub fn to_scene_monster_wave(wave_index: u32, monsters: &Vec<Self>) -> SceneMonsterWave {
        let mut wave_index = wave_index;
        if wave_index <= 0 {
            wave_index += 1;
        }

        SceneMonsterWave {
            iilhbcalikm: wave_index, // wave indexx??
            
            ejahmdkklbn: Some(Holldlkceof { // monster param
                level: monsters.iter().map(|v| v.level).max().unwrap_or(95),
                ..Default::default()
            }),

            monster_list: monsters
                .iter()
                .map(|v| v.to_scene_monster_info())
                .collect::<Vec<_>>(),
            ..Default::default()
        }
    }

    pub fn to_scene_monster_waves(monsters: &Vec<Vec<Self>>) -> Vec<SceneMonsterWave> {
        monsters
            .iter()
            .enumerate()
            .map(|(i, v)| Self::to_scene_monster_wave(i as u32, v))
            .collect::<_>()
    }
}


// BATTLE CONFIG
#[derive(Debug, Serialize, Deserialize, Clone)]
pub struct BattleConfig {
    pub battle_type: BattleType,
    pub monsters: Vec<Vec<Monster>>,
    pub blessings: Vec<BattleBuffJson>,
    pub stage_id: u32,
    pub cycle_count: u32,
    pub path_resonance_id: u32,
    pub custom_stats: Vec<SubAffix>,
}

impl Default for BattleConfig {
    fn default() -> Self {
        Self {
            battle_type: Default::default(),
            monsters: vec![vec![Monster {
                level: 60,
                monster_id: 3014022,
                max_hp: 0,
            }]],
            stage_id: 201012311,
            blessings: Default::default(),
            cycle_count: Default::default(),
            path_resonance_id: Default::default(),
            custom_stats: Default::default(),
        }
    }
}

#[derive(Debug, Serialize, Deserialize, Clone, PartialEq)]
pub enum BattleType {
    DEFAULT = 0,
    MOC = 1,
    PF = 2,
    SU = 3,
}

impl Default for BattleType {
    fn default() -> Self {
        Self::DEFAULT
    }
}

// BATTLE BUFFS
#[derive(Debug, Serialize, Deserialize, Clone, Default)]
pub struct BattleBuffJson {
    pub level: u32,
    pub id: u32,
    pub dynamic_key: Option<DynamicKey>,
}

#[derive(Debug, Serialize, Deserialize, Clone, Default)]
pub struct DynamicKey {
    pub key: String,
    pub value: u32,
}

#[allow(dead_code)]
impl BattleBuffJson {
    pub fn to_battle_buff_proto(&self) -> proto::BattleBuff {
        proto::BattleBuff {
            id: self.id,
            level: self.level,
            wave_flag: 0xffffffff,
            owner_index: 0xffffffff,
            dynamic_values: if let Some(dyn_key) = &self.dynamic_key {
                HashMap::from([(dyn_key.key.clone(), dyn_key.value as f32)])
            } else {
                Default::default()
            },
            ..Default::default()
        }
    }
}

// SCENE 
#[derive(Serialize, Deserialize, Debug, Clone)]
pub struct Scene {
    pub plane_id: u32,
    pub floor_id: u32,
    pub entry_id: u32,
}

impl Default for Scene {
    fn default() -> Self {
        Self {
            entry_id: 2032101,
            plane_id: 20321,
            floor_id: 20321001,
        }
    }
}

// Position

#[derive(Debug, Serialize, Deserialize, Clone, Default)]
pub struct Position {
    pub x: i32,
    pub y: i32,
    pub z: i32,
    pub rot_y: i32,
}

impl Position {
    pub fn is_empty(&self) -> bool {
        return self.x == 0 && self.y == 0 && self.z == 0;
    }

    pub fn to_motion(&self) -> MotionInfo {
        MotionInfo {
            // rot
            eiaoiankefd: Some(Vector {
                baimdminomk: 0,
                bemlopmcgch: self.rot_y,
                bagloppgnpb: 0,
            }),
            // pos
            aomilajjmii: Some(Vector {
                baimdminomk: self.x,
                bemlopmcgch: self.y,
                bagloppgnpb: self.z,
            }),
        }
    }
}


// FREESR-DATA.json
#[derive(Debug, Serialize, Deserialize)]
pub struct JsonData {
    pub lightcones: Vec<Lightcone>,
    pub relics: Vec<Relic>,
    pub avatars: BTreeMap<u32, AvatarJson>,
    #[serde(default)]
    pub battle_config: BattleConfig,

    #[serde(default)]
    pub lineups: BTreeMap<u32, u32>,
    #[serde(default)]
    pub position: Position,
    #[serde(default)]
    pub scene: Scene,
    #[serde(default)]
    pub main_character: MainCharacter,
}

#[derive(Debug, Serialize, Deserialize)]
pub struct JsonData2 {
    #[serde(default)]
    pub lineups: BTreeMap<u32, u32>,
    #[serde(default)]
    pub position: Position,
    #[serde(default)]
    pub scene: Scene,
    #[serde(default)]
    pub main_character: MainCharacter,
}

impl Default for JsonData2 {
    fn default() -> Self {
        let mut lineups = BTreeMap::<u32, u32>::new();
        lineups.insert(0, 8006);
        lineups.insert(1, 0);
        lineups.insert(2, 0);
        lineups.insert(3, 0);

        Self {
            lineups ,
            position: Default::default(),
            main_character: Default::default(),
            scene: Default::default()
        }
    }
}


#[derive(Serialize, Deserialize, Clone, Debug, Copy)]
pub enum MainCharacter {
    MalePyhsical = 8001,
    FemalePhysical = 8002,
    MalePreservation = 8003,
    FemalePreservation = 8004,
    MaleHarmony = 8005,
    FemaleHarmony = 8006,
}

impl MainCharacter {
    // pub fn to_vec() -> Vec<MainCharacter> {
    //     return vec![
    //         MainCharacter::MalePyhsical, 
    //         MainCharacter::FemalePhysical, 
            
    //         MainCharacter::MalePreservation, 
    //         MainCharacter::FemalePreservation, 
            
    //         MainCharacter::MaleHarmony, 
    //         MainCharacter::FemaleHarmony
    //     ]
    // }

    pub fn get_gender(&self) -> Gender {
        if *self as u32 % 2 == 1 {
            Gender::Man
        } else {
            Gender::Woman
        }
    }

    pub fn get_type(&self) -> HeroBasicType {
        match *self {
            Self::MalePyhsical => HeroBasicType::BoyWarrior,
            Self::FemalePhysical => HeroBasicType::GirlWarrior,
            Self::MalePreservation => HeroBasicType::BoyKnight,
            Self::FemalePreservation => HeroBasicType::GirlKnight,
            Self::MaleHarmony => HeroBasicType::BoyShaman,
            Self::FemaleHarmony => HeroBasicType::GirlShaman,
        }
    }
}

impl Default for MainCharacter {
    fn default() -> Self {
        Self::FemaleHarmony
    }
}

impl JsonData {
    pub async fn load() -> Self {

        let mut json: JsonData = match serde_json::from_str(&tokio::fs::read_to_string("freesr-data.json").await.unwrap_or_default()) {
            Ok(db) => db,
            Err(err) => {
                println!("{:#?}", err);
                Self::create_dummy().await
            }
        };

        let json2: JsonData2 = serde_json::from_str(&tokio::fs::read_to_string("persistent").await.unwrap_or_default()).unwrap_or_default();
        json.lineups = json2.lineups;
        json.position = json2.position;
        json.scene = json2.scene;
        json.main_character = json2.main_character;

        json.verify_lineup().await;

        json
    }

    async fn verify_lineup(&mut self) {
        if self.lineups.len() == 0 {
            self.lineups = BTreeMap::<u32, u32>::from([(0, 8006), (1, 0), (2, 0),(3, 0)])
        } else if self.lineups.len() < 4 {
            for i in self.lineups.len()..4 {
                self.lineups.insert(i as u32, 0);
            }
        }
        self.save().await;
    }

    async fn create_dummy() -> Self {
        let mut db = Self {
            lightcones: vec![],
            relics: vec![],
            avatars: BTreeMap::<u32, AvatarJson>::new(),
            lineups: BTreeMap::<u32, u32>::from([(0, 8006), (1, 0), (2, 0),(3, 0)]),
            scene: Default::default(),
            position: Default::default(),
            battle_config: Default::default(),
            main_character: Default::default(),
        };
        db.avatars.insert(
            8006,
            AvatarJson {
                avatar_id: 8006,
                level: 80,
                promotion: 6,
                sp_max: Some(10_000),
                sp_value: Some(10_000),
                owner_uid: 0,
                techniques: vec![],
                data: AvatarData {
                    rank: 6,
                    skills: BTreeMap::from([
                        (800601, 6),
                        (800602, 10),
                        (800603, 10),
                        (800604, 10),
                        (800605, 1),
                    ]),
                },
            },
        );

        db.lineups.insert(0, 8006);

        db.save().await;

        db
    }

    pub async fn save_lineup(&self) {
        self.save().await;
    }

    pub async fn save(&self) {
        let json = serde_json::to_string_pretty(&self).unwrap();
        let _ = tokio::fs::write("freesr-data.json", json.as_bytes()).await;
        let _ = tokio::fs::write("persistent", serde_json::to_string_pretty(&JsonData2 {
            lineups: self.lineups.clone(),
            main_character: self.main_character,
            position: self.position.clone(),
            scene: self.scene.clone()
        }).unwrap().as_bytes()).await;
    }
    
    pub async fn get_level_group(
        &self,
        entry_id: u32,
    ) -> Option<(SimpleLevelGroup, MapEntrance, Option<MazePlane>)> {
        let resources = &GAME_RESOURCES;
        let enterance = resources.map_entrance.get(&entry_id);

        if let Some(enterance) = enterance {
            let plane = resources.maze_plane.get(&enterance.plane_id);
            if let Some(level) = resources
                .level_group
                .get(&format!("P{}_F{}", enterance.plane_id, enterance.floor_id))
            {
                // TODO: use reference somehow, not cloning
                return Some((level.clone(), enterance.clone(), plane.cloned()));
            };
        }

        None
    }
}