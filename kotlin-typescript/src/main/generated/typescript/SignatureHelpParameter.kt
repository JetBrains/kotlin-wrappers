// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface SignatureHelpParameter {
    var name: String
    var documentation: ReadonlyArray<SymbolDisplayPart>
    var displayParts: ReadonlyArray<SymbolDisplayPart>
    var isOptional: Boolean
    var isRest: Boolean?
}
