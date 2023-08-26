package node.dns


sealed external interface AnyTxtRecord {
    var type: String /* 'TXT' */
    var entries: js.core.ReadonlyArray<String>
}
