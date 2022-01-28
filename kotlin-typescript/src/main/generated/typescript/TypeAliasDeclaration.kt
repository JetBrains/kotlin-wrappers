// Automatically generated - do not modify!

package typescript

sealed external interface TypeAliasDeclaration : DeclarationStatement, JSDocContainer {
    override val kind: SyntaxKind.TypeAliasDeclaration
    override val name: Identifier
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val type: TypeNode
}
