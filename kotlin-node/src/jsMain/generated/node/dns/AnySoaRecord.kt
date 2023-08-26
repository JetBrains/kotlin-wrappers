package node.dns


sealed external interface AnySoaRecord : SoaRecord {
    var type: String /* 'SOA' */
}
