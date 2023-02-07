// Automatically generated - do not modify!

package typescript

sealed external interface EnumDeclaration : DeclarationStatement, JSDocContainer, Union.EnumDeclaration_ {
    override val kind: SyntaxKind.EnumDeclaration
    val modifiers: NodeArray<Modifier>?
    override val name: Identifier
    val members: NodeArray<EnumMember>
}
