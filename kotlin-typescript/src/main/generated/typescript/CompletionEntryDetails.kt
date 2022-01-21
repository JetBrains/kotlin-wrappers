// Automatically generated - do not modify!

package typescript

external interface CompletionEntryDetails {
    var name: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var displayParts: ReadonlyArray<SymbolDisplayPart>
    var documentation: ReadonlyArray<SymbolDisplayPart>?
    var tags: ReadonlyArray<JSDocTagInfo>?
    var codeActions: ReadonlyArray<CodeAction>?

    /** @deprecated Use `sourceDisplay` instead. */
    var source: ReadonlyArray<SymbolDisplayPart>?
    var sourceDisplay: ReadonlyArray<SymbolDisplayPart>?
}
