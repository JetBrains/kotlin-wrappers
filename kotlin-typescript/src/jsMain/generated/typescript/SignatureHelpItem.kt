// Automatically generated - do not modify!

package typescript

/**
 * Represents a single signature to show in signature help.
 * The id is used for subsequent calls into the language service to ask questions about the
 * signature help item in the context of any documents that have been updated.  i.e. after
 * an edit has happened, while signature help is still active, the host can ask important
 * questions like 'what parameter is the user currently contained within?'.
 */
sealed external interface SignatureHelpItem {
    var isVariadic: Boolean
    var prefixDisplayParts: js.array.ReadonlyArray<SymbolDisplayPart>
    var suffixDisplayParts: js.array.ReadonlyArray<SymbolDisplayPart>
    var separatorDisplayParts: js.array.ReadonlyArray<SymbolDisplayPart>
    var parameters: js.array.ReadonlyArray<SignatureHelpParameter>
    var documentation: js.array.ReadonlyArray<SymbolDisplayPart>
    var tags: js.array.ReadonlyArray<JSDocTagInfo>
}
