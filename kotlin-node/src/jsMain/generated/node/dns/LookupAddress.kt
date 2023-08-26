package node.dns


sealed external interface LookupAddress {
    var address: String
    var family: Double
}
