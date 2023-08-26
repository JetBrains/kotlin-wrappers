package node.dns


sealed external interface MxRecord {
    var priority: Double
    var exchange: String
}
