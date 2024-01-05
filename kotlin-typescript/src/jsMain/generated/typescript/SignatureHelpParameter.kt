// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface SignatureHelpParameter {
    var name: String
    var documentation: ReadonlyArray<SymbolDisplayPart>
    var displayParts: ReadonlyArray<SymbolDisplayPart>
    var isOptional: Boolean
    var isRest: Boolean?
}
