// Automatically generated - do not modify!

package typescript

sealed external interface CompletionEntryDetails {
    var name: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var displayParts: js.array.ReadonlyArray<SymbolDisplayPart>
    var documentation: js.array.ReadonlyArray<SymbolDisplayPart>?
    var tags: js.array.ReadonlyArray<JSDocTagInfo>?
    var codeActions: js.array.ReadonlyArray<CodeAction>?

    /** @deprecated Use `sourceDisplay` instead. */
    var source: js.array.ReadonlyArray<SymbolDisplayPart>?
    var sourceDisplay: js.array.ReadonlyArray<SymbolDisplayPart>?
}
