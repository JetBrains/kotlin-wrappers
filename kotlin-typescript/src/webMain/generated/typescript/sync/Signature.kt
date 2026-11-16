// Automatically generated - do not modify!

package typescript.sync

import typescript.ast.SignatureDeclaration
import typescript.ast.SignatureDeclarationField
import typescript.ast.SymbolDisplayPart

external interface Signature {
    var declaration: (SignatureDeclarationField)?
    var typeParameters: (js.array.ReadonlyArray<TypeParameter>)?
    var parameters: js.array.ReadonlyArray<Symbol>
    var thisParameter: Symbol?

    fun getDeclaration(): SignatureDeclaration

    fun getTypeParameters(): js.array.ReadonlyArray<TypeParameter>?

    fun getParameters(): js.array.ReadonlyArray<Symbol>

    fun getTypeParameterAtPosition(pos: Int): Type

    fun getReturnType(): Type

    fun getDocumentationComment(typeChecker: TypeChecker?): js.array.ReadonlyArray<SymbolDisplayPart>

    fun getJsDocTags(): js.array.ReadonlyArray<JSDocTagInfo>
}
