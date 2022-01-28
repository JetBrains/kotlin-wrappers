// Automatically generated - do not modify!

package typescript

sealed external interface Signature {
    var declaration: dynamic /* SignatureDeclaration | JSDocSignature */
    var typeParameters: ReadonlyArray<TypeParameter>?
    var parameters: ReadonlyArray<Symbol>
    fun getDeclaration(): SignatureDeclaration
    fun getTypeParameters(): ReadonlyArray<TypeParameter>?
    fun getParameters(): ReadonlyArray<Symbol>
    fun getReturnType(): Type
    fun getDocumentationComment(typeChecker: TypeChecker?): ReadonlyArray<SymbolDisplayPart>
    fun getJsDocTags(): ReadonlyArray<JSDocTagInfo>
}
