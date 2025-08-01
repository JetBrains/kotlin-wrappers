// Automatically generated - do not modify!

package typescript

sealed external interface NavigateToItem {
    var name: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var matchKind: NavigateToItemMatchKind
    var isCaseSensitive: Boolean
    var fileName: String
    var textSpan: TextSpan
    var containerName: String
    var containerKind: ScriptElementKind
}
