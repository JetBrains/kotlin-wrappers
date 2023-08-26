package node.dns


sealed external interface AnyMxRecord : MxRecord {
    var type: String /* 'MX' */
}
