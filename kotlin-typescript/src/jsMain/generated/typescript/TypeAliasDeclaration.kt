// Automatically generated - do not modify!

package typescript

sealed external interface TypeAliasDeclaration : DeclarationStatement, JSDocContainer, Union.TypeAliasDeclaration_ {
    override val kind: SyntaxKind.TypeAliasDeclaration
    val modifiers: NodeArray<Modifier>?
    override val name: Identifier
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val type: TypeNode
}
