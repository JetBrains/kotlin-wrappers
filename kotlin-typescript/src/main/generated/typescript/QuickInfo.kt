// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface QuickInfo {
    var kind: ScriptElementKind
    var kindModifiers: String
    var textSpan: TextSpan
    var displayParts: ReadonlyArray<SymbolDisplayPart>?
    var documentation: ReadonlyArray<SymbolDisplayPart>?
    var tags: ReadonlyArray<JSDocTagInfo>?
}
