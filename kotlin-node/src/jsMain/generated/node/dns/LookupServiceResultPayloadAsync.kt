package node.dns


sealed external interface LookupServiceResultPayload {
    var hostname: String
    var service: String
}
