package node.dns


sealed external interface AnyAaaaRecord : RecordWithTtl {
    var type: String /* 'AAAA' */
}
