package node.dns


sealed external interface AnyNsRecord {
    var type: String /* 'NS' */
    var value: String
}
