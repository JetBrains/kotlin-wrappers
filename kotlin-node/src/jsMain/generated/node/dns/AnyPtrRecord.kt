package node.dns


sealed external interface AnyPtrRecord {
    var type: String /* 'PTR' */
    var value: String
}
