// Automatically generated - do not modify!

package typescript

sealed external interface InterfaceDeclaration : DeclarationStatement, JSDocContainer, HasJSDoc, HasModifiers,
    PropertySignatureParent, MethodSignatureParent, GetAccessorDeclarationParent, SetAccessorDeclarationParent,
    ObjectTypeDeclaration, DeclarationWithTypeParameterChildren, HeritageClauseParent {
    override val kind: SyntaxKind.InterfaceDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier
    val typeParameters: NodeArray<TypeParameterDeclaration>?
    val heritageClauses: NodeArray<HeritageClause>?
    val members: NodeArray<TypeElement>
}
