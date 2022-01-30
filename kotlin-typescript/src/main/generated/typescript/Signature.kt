// Automatically generated - do not modify!

package typescript

sealed external interface Signature {
    var declaration: Union.Signature_declaration?
    var typeParameters: ReadonlyArray<TypeParameter>?
    var parameters: ReadonlyArray<Symbol>
    fun getDeclaration(): SignatureDeclaration
    fun getTypeParameters(): ReadonlyArray<TypeParameter>?
    fun getParameters(): ReadonlyArray<Symbol>
    fun getReturnType(): Type
    fun getDocumentationComment(typeChecker: TypeChecker?): ReadonlyArray<SymbolDisplayPart>
    fun getJsDocTags(): ReadonlyArray<JSDocTagInfo>
}
