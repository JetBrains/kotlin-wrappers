// Automatically generated - do not modify!

package typescript

sealed external interface Scanner {
    /** @deprecated use {@link getTokenFullStart} */
    fun getStartPos(): Double
    fun getToken(): SyntaxKind
    fun getTokenFullStart(): Double
    fun getTokenStart(): Double
    fun getTokenEnd(): Double

    /** @deprecated use {@link getTokenEnd} */
    fun getTextPos(): Double

    /** @deprecated use {@link getTokenStart} */
    fun getTokenPos(): Double
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

    /** @deprecated use {@link reScanTemplateToken}(false) */
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
    fun setText(text: String?, start: Double = definedExternally, length: Double = definedExternally)
    fun setOnError(onError: ErrorCallback?)
    fun setScriptTarget(scriptTarget: ScriptTarget)
    fun setLanguageVariant(variant: LanguageVariant)
    fun setScriptKind(scriptKind: ScriptKind)
    fun setJSDocParsingMode(kind: JSDocParsingMode)

    /** @deprecated use {@link resetTokenState} */
    fun setTextPos(textPos: Double)
    fun resetTokenState(pos: Double)
    fun <T> lookAhead(callback: () -> T): T
    fun <T> scanRange(start: Double, length: Double, callback: () -> T): T
    fun <T> tryScan(callback: () -> T): T
}
