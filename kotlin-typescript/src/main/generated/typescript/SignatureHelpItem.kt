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
    var prefixDisplayParts: ReadonlyArray<SymbolDisplayPart>
    var suffixDisplayParts: ReadonlyArray<SymbolDisplayPart>
    var separatorDisplayParts: ReadonlyArray<SymbolDisplayPart>
    var parameters: ReadonlyArray<SignatureHelpParameter>
    var documentation: ReadonlyArray<SymbolDisplayPart>
    var tags: ReadonlyArray<JSDocTagInfo>
}
