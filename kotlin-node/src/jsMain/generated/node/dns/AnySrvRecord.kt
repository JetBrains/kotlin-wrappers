package node.dns


sealed external interface AnySrvRecord : SrvRecord {
    var type: String /* 'SRV' */
}
