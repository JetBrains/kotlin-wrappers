package node.dns


sealed external interface AnyCnameRecord {
    var type: String /* 'CNAME' */
    var value: String
}
