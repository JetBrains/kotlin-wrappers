package node.dns


sealed external interface SrvRecord {
    var priority: Double
    var weight: Double
    var port: Double
    var name: String
}
