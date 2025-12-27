// Automatically generated - do not modify!

package node.dns

sealed external interface AnyTxtRecord {
    var type: String // "TXT"
    var entries: js.array.ReadonlyArray<String>
}
