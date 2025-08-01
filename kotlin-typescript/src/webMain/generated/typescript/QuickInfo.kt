// Automatically generated - do not modify!

package typescript

sealed external interface QuickInfo {
    var kind: ScriptElementKind
    var kindModifiers: String
    var textSpan: TextSpan
    var displayParts: js.array.ReadonlyArray<SymbolDisplayPart>?
    var documentation: js.array.ReadonlyArray<SymbolDisplayPart>?
    var tags: js.array.ReadonlyArray<JSDocTagInfo>?
}
