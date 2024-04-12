use lazy_static::lazy_static;
use serde::{Deserialize, Serialize};
use serde_json::Value;
use std::collections::HashMap;

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct LevelGroup {
    #[serde(rename = "GroupGUID")]
    pub group_guid: String,
    #[serde(default)]
    #[serde(rename = "LoadSide")]
    pub load_side: String,
    #[serde(default)]
    #[serde(rename = "LoadOnInitial")]
    pub load_on_initial: bool,

    // #[serde(rename = "AnchorList")]
    // pub anchor_list: Vec<LevelAnchor>,
    #[serde(default)]
    #[serde(rename = "MonsterList")]
    pub monster_list: Vec<LevelMonster>,
    #[serde(default)]
    #[serde(rename = "PropList")]
    pub prop_list: Vec<LevelProp>,
    #[serde(default)]
    #[serde(rename = "NPCList")]
    pub npc_list: Vec<LevelNPC>,
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct LevelProp {
    #[serde(rename = "ID")]
    pub id: i64,
    #[serde(default)]
    #[serde(rename = "Category")]
    pub category: String,
    #[serde(default)]
    #[serde(rename = "GroupName")]
    pub group_name: String,
    #[serde(default)]
    #[serde(rename = "LoadSide")]
    pub load_side: String,
    #[serde(default)]
    #[serde(rename = "PosX")]
    pub pos_x: f64,
    #[serde(default)]
    #[serde(rename = "PosY")]
    pub pos_y: f64,
    #[serde(default)]
    #[serde(rename = "PosZ")]
    pub pos_z: f64,
    #[serde(default)]
    #[serde(rename = "RotY")]
    pub rot_y: f64,
    #[serde(rename = "PropID")]
    pub prop_id: u32,
    #[serde(rename = "AnchorID")]
    pub anchor_id: Option<u32>,
    #[serde(rename = "AnchorGroupID")]
    pub anchor_group_id: Option<u32>,
    #[serde(rename = "MappingInfoID")]
    pub mapping_info_id: Option<u32>,

    #[serde(default)]
    #[serde(rename = "State")]
    pub state: PropState,

    #[serde(default)]
    pub prop_state_list: Vec<PropState>,
    #[serde(default)]
    pub group_id: u32,
    #[serde(rename = "IsDelete")]
    #[serde(default)]
    pub is_delete: bool,
    #[serde(rename = "IsClientOnly")]
    #[serde(default)]
    pub client_only: bool,
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct LevelAnchor {
    #[serde(rename = "ID")]
    pub id: i64,
    #[serde(default)]
    #[serde(rename = "PosX")]
    pub pos_x: f64,
    #[serde(default)]
    #[serde(rename = "PosY")]
    pub pos_y: f64,
    #[serde(default)]
    #[serde(rename = "PosZ")]
    pub pos_z: f64,
    #[serde(default)]
    #[serde(rename = "RotY")]
    pub rot_y: f64,
    #[serde(default)]
    pub group_id: u32,
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct LevelNPC {
    #[serde(rename = "ID")]
    pub id: i64,
    #[serde(default)]
    #[serde(rename = "PosX")]
    pub pos_x: f64,
    #[serde(default)]
    #[serde(rename = "PosY")]
    pub pos_y: f64,
    #[serde(default)]
    #[serde(rename = "PosZ")]
    pub pos_z: f64,
    #[serde(rename = "Name")]
    pub name: String,
    #[serde(default)]
    #[serde(rename = "RotY")]
    pub rot_y: f64,
    #[serde(rename = "NPCID")]
    pub npcid: i64,
    #[serde(default)]
    pub group_id: u32,
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct LevelMonster {
    #[serde(rename = "ID")]
    pub id: i64,
    #[serde(default)]
    #[serde(rename = "RotY")]
    pub rot_y: f64,
    #[serde(default)]
    #[serde(rename = "PosX")]
    pub pos_x: f64,
    #[serde(default)]
    #[serde(rename = "PosY")]
    pub pos_y: f64,
    #[serde(default)]
    #[serde(rename = "PosZ")]
    pub pos_z: f64,
    #[serde(rename = "NPCMonsterID")]
    pub npcmonster_id: i64,
    #[serde(default)]
    #[serde(rename = "EventID")]
    pub event_id: i64,
    #[serde(default)]
    pub group_id: u32,
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct MapEntrance {
    #[serde(rename = "ID")]
    pub id: u32,
    #[serde(default)]
    #[serde(rename = "EntranceType")]
    pub entrance_type: PlaneType,
    #[serde(rename = "PlaneID")]
    pub plane_id: u32,
    #[serde(rename = "FloorID")]
    pub floor_id: u32,
    #[serde(rename = "BeginMainMissionList")]
    pub begin_main_mission_list: Vec<Value>,
    #[serde(rename = "FinishMainMissionList")]
    pub finish_main_mission_list: Vec<Value>,
    #[serde(rename = "FinishSubMissionList")]
    pub finish_sub_mission_list: Vec<Value>,
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct MazePlane {
    #[serde(rename = "PlaneID")]
    pub plane_id: u32,
    #[serde(rename = "PlaneType")]
    pub plane_type: PlaneType,
    #[serde(rename = "SubType")]
    pub sub_type: u32,
    #[serde(rename = "MazePoolType")]
    pub maze_pool_type: u32,
    #[serde(rename = "WorldID")]
    pub world_id: u32,
    #[serde(rename = "StartFloorID")]
    pub start_floor_id: u32,
    #[serde(rename = "FloorIDList")]
    pub floor_idlist: Vec<u32>,
}

#[derive(Serialize, Deserialize, Debug, Clone, PartialEq, Copy)]
pub enum PlaneType {
    Unknown = 0,
    Maze = 2,
    Train = 3,
    Challenge = 4,
    Rogue = 5,
    Raid = 6,
    AetherDivide = 7,
    TrialActivity = 8,
    #[serde(other)]
    Town = 1,
}

impl Default for PlaneType {
    fn default() -> Self {
        Self::Maze
    }
}

#[derive(Default, Debug, Clone, PartialEq, Serialize, Deserialize)]
#[serde(rename_all = "camelCase")]
pub struct MazeProp {
    #[serde(rename = "ID")]
    pub id: i64,
    #[serde(rename = "PropType")]
    pub prop_type: String,
    #[serde(rename = "PropStateList")]
    pub prop_state_list: Vec<PropState>,
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub enum PropState {
    Closed = 0,
    Open = 1,
    Locked = 2,
    BridgeState1 = 3,
    BridgeState2 = 4,
    BridgeState3 = 5,
    BridgeState4 = 6,
    CheckPointDisable = 7,
    CheckPointEnable = 8,
    TriggerDisable = 9,
    TriggerEnable = 10,
    ChestLocked = 11,
    ChestClosed = 12,
    ChestUsed = 13,
    Elevator1 = 14,
    Elevator2 = 15,
    Elevator3 = 16,
    WaitActive = 17,
    EventClose = 18,
    EventOpen = 19,
    Hidden = 20,
    TeleportGate0 = 21,
    TeleportGate1 = 22,
    TeleportGate2 = 23,
    TeleportGate3 = 24,
    Destructed = 25,
    CustomState01 = 101,
    CustomState02 = 102,
    CustomState03 = 103,
    CustomState04 = 104,
    CustomState05 = 105,
    CustomState06 = 106,
    CustomState07 = 107,
    CustomState08 = 108,
    CustomState09 = 109,
}

impl Default for PropState {
    fn default() -> Self {
        PropState::Closed
    }
}

pub type IntMap<T> = HashMap<u32, T>;
pub type StringMap<T> = HashMap<String, T>;

#[derive(Debug, Serialize, Deserialize, Clone)]
pub struct SimpleLevelGroup {
    pub teleports: IntMap<LevelProp>,
    pub props: Vec<LevelProp>,
    pub npcs: Vec<LevelNPC>,
    pub monsters: Vec<LevelMonster>,
    pub group_ids: Vec<u32>,
}

#[derive(Debug, Serialize, Deserialize)]
pub struct GameResources {
    pub map_entrance: IntMap<MapEntrance>,
    /// Key is P{PLANE_ID}_F{FLOOR_ID}
    pub level_group: StringMap<SimpleLevelGroup>,
    pub maze_prop: IntMap<MazeProp>,
    pub maze_plane: IntMap<MazePlane>,
}

impl GameResources {
    pub fn new() -> Self {
        let str = std::fs::read_to_string("./resources.json")
            .expect("resources.json is broken, pls redownload");
        let res: Self =
            serde_json::from_str(&str).expect("resources.json is broken, pls redownload");
        res
    }
}

lazy_static! {
    pub static ref GAME_RESOURCES: GameResources = GameResources::new();
    pub static ref RELIC_TYPE: HashMap<u32, u32> = HashMap::from([
        (31011, 1),
        (41011, 1),
        (51011, 1),
        (61011, 1),
        (31012, 2),
        (41012, 2),
        (51012, 2),
        (61012, 2),
        (31013, 3),
        (41013, 3),
        (51013, 3),
        (61013, 3),
        (31014, 4),
        (41014, 4),
        (51014, 4),
        (61014, 4),
        (31021, 1),
        (41021, 1),
        (51021, 1),
        (61021, 1),
        (31022, 2),
        (41022, 2),
        (51022, 2),
        (61022, 2),
        (31023, 3),
        (41023, 3),
        (51023, 3),
        (61023, 3),
        (31024, 4),
        (41024, 4),
        (51024, 4),
        (61024, 4),
        (31031, 1),
        (41031, 1),
        (51031, 1),
        (61031, 1),
        (31032, 2),
        (41032, 2),
        (51032, 2),
        (61032, 2),
        (31033, 3),
        (41033, 3),
        (51033, 3),
        (61033, 3),
        (31034, 4),
        (41034, 4),
        (51034, 4),
        (61034, 4),
        (31041, 1),
        (41041, 1),
        (51041, 1),
        (61041, 1),
        (31042, 2),
        (41042, 2),
        (51042, 2),
        (61042, 2),
        (31043, 3),
        (41043, 3),
        (51043, 3),
        (61043, 3),
        (31044, 4),
        (41044, 4),
        (51044, 4),
        (61044, 4),
        (31051, 1),
        (41051, 1),
        (51051, 1),
        (61051, 1),
        (31052, 2),
        (41052, 2),
        (51052, 2),
        (61052, 2),
        (31053, 3),
        (41053, 3),
        (51053, 3),
        (61053, 3),
        (31054, 4),
        (41054, 4),
        (51054, 4),
        (61054, 4),
        (31061, 1),
        (41061, 1),
        (51061, 1),
        (61061, 1),
        (31062, 2),
        (41062, 2),
        (51062, 2),
        (61062, 2),
        (31063, 3),
        (41063, 3),
        (51063, 3),
        (61063, 3),
        (31064, 4),
        (41064, 4),
        (51064, 4),
        (61064, 4),
        (31071, 1),
        (41071, 1),
        (51071, 1),
        (61071, 1),
        (31072, 2),
        (41072, 2),
        (51072, 2),
        (61072, 2),
        (31073, 3),
        (41073, 3),
        (51073, 3),
        (61073, 3),
        (31074, 4),
        (41074, 4),
        (51074, 4),
        (61074, 4),
        (31081, 1),
        (41081, 1),
        (51081, 1),
        (61081, 1),
        (31082, 2),
        (41082, 2),
        (51082, 2),
        (61082, 2),
        (31083, 3),
        (41083, 3),
        (51083, 3),
        (61083, 3),
        (31084, 4),
        (41084, 4),
        (51084, 4),
        (61084, 4),
        (31091, 1),
        (41091, 1),
        (51091, 1),
        (61091, 1),
        (31092, 2),
        (41092, 2),
        (51092, 2),
        (61092, 2),
        (31093, 3),
        (41093, 3),
        (51093, 3),
        (61093, 3),
        (31094, 4),
        (41094, 4),
        (51094, 4),
        (61094, 4),
        (31101, 1),
        (41101, 1),
        (51101, 1),
        (61101, 1),
        (31102, 2),
        (41102, 2),
        (51102, 2),
        (61102, 2),
        (31103, 3),
        (41103, 3),
        (51103, 3),
        (61103, 3),
        (31104, 4),
        (41104, 4),
        (51104, 4),
        (61104, 4),
        (31111, 1),
        (41111, 1),
        (51111, 1),
        (61111, 1),
        (31112, 2),
        (41112, 2),
        (51112, 2),
        (61112, 2),
        (31113, 3),
        (41113, 3),
        (51113, 3),
        (61113, 3),
        (31114, 4),
        (41114, 4),
        (51114, 4),
        (61114, 4),
        (31121, 1),
        (41121, 1),
        (51121, 1),
        (61121, 1),
        (31122, 2),
        (41122, 2),
        (51122, 2),
        (61122, 2),
        (31123, 3),
        (41123, 3),
        (51123, 3),
        (61123, 3),
        (31124, 4),
        (41124, 4),
        (51124, 4),
        (61124, 4),
        (33015, 5),
        (43015, 5),
        (53015, 5),
        (63015, 5),
        (33016, 6),
        (43016, 6),
        (53016, 6),
        (63016, 6),
        (33025, 5),
        (43025, 5),
        (53025, 5),
        (63025, 5),
        (33026, 6),
        (43026, 6),
        (53026, 6),
        (63026, 6),
        (33035, 5),
        (43035, 5),
        (53035, 5),
        (63035, 5),
        (33036, 6),
        (43036, 6),
        (53036, 6),
        (63036, 6),
        (33045, 5),
        (43045, 5),
        (53045, 5),
        (63045, 5),
        (33046, 6),
        (43046, 6),
        (53046, 6),
        (63046, 6),
        (33055, 5),
        (43055, 5),
        (53055, 5),
        (63055, 5),
        (33056, 6),
        (43056, 6),
        (53056, 6),
        (63056, 6),
        (33065, 5),
        (43065, 5),
        (53065, 5),
        (63065, 5),
        (33066, 6),
        (43066, 6),
        (53066, 6),
        (63066, 6),
        (33075, 5),
        (43075, 5),
        (53075, 5),
        (63075, 5),
        (33076, 6),
        (43076, 6),
        (53076, 6),
        (63076, 6),
        (33085, 5),
        (43085, 5),
        (53085, 5),
        (63085, 5),
        (33086, 6),
        (43086, 6),
        (53086, 6),
        (63086, 6),
        (33095, 5),
        (43095, 5),
        (53095, 5),
        (63095, 5),
        (33096, 6),
        (43096, 6),
        (53096, 6),
        (63096, 6),
        (33105, 5),
        (43105, 5),
        (53105, 5),
        (63105, 5),
        (33106, 6),
        (43106, 6),
        (53106, 6),
        (63106, 6),
        (55001, 3),
        (55002, 4),
        (55003, 3),
        (55004, 3),
        (55005, 4),
        (55006, 3),
        (31131, 1),
        (41131, 1),
        (51131, 1),
        (61131, 1),
        (31132, 2),
        (41132, 2),
        (51132, 2),
        (61132, 2),
        (31133, 3),
        (41133, 3),
        (51133, 3),
        (61133, 3),
        (31134, 4),
        (41134, 4),
        (51134, 4),
        (61134, 4),
        (31141, 1),
        (41141, 1),
        (51141, 1),
        (61141, 1),
        (31142, 2),
        (41142, 2),
        (51142, 2),
        (61142, 2),
        (31143, 3),
        (41143, 3),
        (51143, 3),
        (61143, 3),
        (31144, 4),
        (41144, 4),
        (51144, 4),
        (61144, 4),
        (31151, 1),
        (41151, 1),
        (51151, 1),
        (61151, 1),
        (31152, 2),
        (41152, 2),
        (51152, 2),
        (61152, 2),
        (31153, 3),
        (41153, 3),
        (51153, 3),
        (61153, 3),
        (31154, 4),
        (41154, 4),
        (51154, 4),
        (61154, 4),
        (31161, 1),
        (41161, 1),
        (51161, 1),
        (61161, 1),
        (31162, 2),
        (41162, 2),
        (51162, 2),
        (61162, 2),
        (31163, 3),
        (41163, 3),
        (51163, 3),
        (61163, 3),
        (31164, 4),
        (41164, 4),
        (51164, 4),
        (61164, 4),
        (33115, 5),
        (43115, 5),
        (53115, 5),
        (63115, 5),
        (33116, 6),
        (43116, 6),
        (53116, 6),
        (63116, 6),
        (33125, 5),
        (43125, 5),
        (53125, 5),
        (63125, 5),
        (33126, 6),
        (43126, 6),
        (53126, 6),
        (63126, 6),
        (31171, 1),
        (41171, 1),
        (51171, 1),
        (61171, 1),
        (31172, 2),
        (41172, 2),
        (51172, 2),
        (61172, 2),
        (31173, 3),
        (41173, 3),
        (51173, 3),
        (61173, 3),
        (31174, 4),
        (41174, 4),
        (51174, 4),
        (61174, 4),
        (31181, 1),
        (41181, 1),
        (51181, 1),
        (61181, 1),
        (31182, 2),
        (41182, 2),
        (51182, 2),
        (61182, 2),
        (31183, 3),
        (41183, 3),
        (51183, 3),
        (61183, 3),
        (31184, 4),
        (41184, 4),
        (51184, 4),
        (61184, 4),
        (33135, 5),
        (43135, 5),
        (53135, 5),
        (63135, 5),
        (33136, 6),
        (43136, 6),
        (53136, 6),
        (63136, 6),
        (33145, 5),
        (43145, 5),
        (53145, 5),
        (63145, 5),
        (33146, 6),
        (43146, 6),
        (53146, 6),
        (63146, 6),
    ]);
}
