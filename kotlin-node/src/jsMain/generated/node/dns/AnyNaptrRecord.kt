package node.dns


sealed external interface AnyNaptrRecord : NaptrRecord {
    var type: String /* 'NAPTR' */
}
