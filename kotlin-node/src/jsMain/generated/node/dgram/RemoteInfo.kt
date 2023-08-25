package node.dgram


sealed external interface RemoteInfo {
    var address: String
    var family: RemoteInfoFamily
    var port: Double
    var size: Double
}
