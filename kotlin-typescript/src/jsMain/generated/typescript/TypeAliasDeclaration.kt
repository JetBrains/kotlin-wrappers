// Automatically generated - do not modify!

package typescript

sealed external interface TypeAliasDeclaration : DeclarationStatement, JSDocContainer, LocalsContainer,
    Union.TypeAliasDeclaration_ {
    override val kind: SyntaxKind.TypeAliasDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val type: TypeNode
}
