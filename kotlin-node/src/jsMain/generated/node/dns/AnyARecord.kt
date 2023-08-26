package node.dns


sealed external interface AnyARecord : RecordWithTtl {
    var type: String /* 'A' */
}
