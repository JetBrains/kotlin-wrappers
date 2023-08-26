package node.dns


sealed external interface RecordWithTtl {
    var address: String
    var ttl: Double
}
