// Automatically generated - do not modify!

package typescript

sealed external interface Signature {
    var declaration: (SignatureDeclarationField)?
    var typeParameters: (js.array.ReadonlyArray<TypeParameter>)?
    var parameters: js.array.ReadonlyArray<Symbol>
    var thisParameter: Symbol?
    fun getDeclaration(): SignatureDeclaration
    fun getTypeParameters(): js.array.ReadonlyArray<TypeParameter>?
    fun getParameters(): js.array.ReadonlyArray<Symbol>
    fun getTypeParameterAtPosition(pos: Double): Type
    fun getReturnType(): Type
    fun getDocumentationComment(typeChecker: TypeChecker?): js.array.ReadonlyArray<SymbolDisplayPart>
    fun getJsDocTags(): js.array.ReadonlyArray<JSDocTagInfo>
}
