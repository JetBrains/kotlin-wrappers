// Automatically generated - do not modify!

package typescript.ast

external interface TypeAliasDeclaration :
    DeclarationStatement,
    JSDocContainer,
    LocalsContainer,
    HasJSDoc,
    HasType,
    HasModifiers,
    DeclarationWithTypeParameterChildren {
    override val kind: SyntaxKind.TypeAliasDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val type: TypeNode
}
