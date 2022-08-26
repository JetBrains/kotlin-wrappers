// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface CompletionEntryDetails {
    var name: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var displayParts: ReadonlyArray<SymbolDisplayPart>
    var documentation: ReadonlyArray<SymbolDisplayPart>?
    var tags: ReadonlyArray<JSDocTagInfo>?
    var codeActions: ReadonlyArray<CodeAction>?

    var sourceDisplay: ReadonlyArray<SymbolDisplayPart>?
}
