// Automatically generated - do not modify!

package typescript

sealed external interface InterfaceDeclaration : DeclarationStatement, JSDocContainer, Union.InterfaceDeclaration_ {
    override val kind: SyntaxKind.InterfaceDeclaration
    override val name: Identifier
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val heritageClauses: NodeArray<HeritageClause>?
    val members: NodeArray<TypeElement>
}
