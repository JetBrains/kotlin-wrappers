// Automatically generated - do not modify!

package typescript

sealed external interface Scanner {
    fun getStartPos(): Int
    fun getToken(): SyntaxKind
    fun getTextPos(): Int
    fun getTokenPos(): Int
    fun getTokenText(): String
    fun getTokenValue(): String
    fun hasUnicodeEscape(): Boolean
    fun hasExtendedUnicodeEscape(): Boolean
    fun hasPrecedingLineBreak(): Boolean
    fun isIdentifier(): Boolean
    fun isReservedWord(): Boolean
    fun isUnterminated(): Boolean
    fun reScanGreaterToken(): SyntaxKind
    fun reScanSlashToken(): SyntaxKind
    fun reScanAsteriskEqualsToken(): SyntaxKind
    fun reScanTemplateToken(isTaggedTemplate: Boolean): SyntaxKind
    fun reScanTemplateHeadOrNoSubstitutionTemplate(): SyntaxKind
    fun scanJsxIdentifier(): SyntaxKind
    fun scanJsxAttributeValue(): SyntaxKind
    fun reScanJsxAttributeValue(): SyntaxKind
    fun reScanJsxToken(allowMultilineJsxText: Boolean = definedExternally): JsxTokenSyntaxKind
    fun reScanLessThanToken(): SyntaxKind
    fun reScanHashToken(): SyntaxKind
    fun reScanQuestionToken(): SyntaxKind
    fun reScanInvalidIdentifier(): SyntaxKind
    fun scanJsxToken(): JsxTokenSyntaxKind
    fun scanJsDocToken(): JSDocSyntaxKind
    fun scan(): SyntaxKind
    fun getText(): String
    fun setText(
        text: String?,
        start: Int = definedExternally,
        length: Int = definedExternally,
    )

    fun setOnError(onError: ErrorCallback?)
    fun setScriptTarget(scriptTarget: ScriptTarget)
    fun setLanguageVariant(variant: LanguageVariant)
    fun setTextPos(textPos: Int)
    fun <T> lookAhead(callback: () -> T): T
    fun <T> scanRange(
        start: Int,
        length: Int,
        callback: () -> T,
    ): T

    fun <T> tryScan(callback: () -> T): T
}
