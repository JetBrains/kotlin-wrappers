// Automatically generated - do not modify!

package typescript

sealed external interface GetAccessorDeclaration : FunctionLikeDeclarationBase, ClassElement, TypeElement,
    ObjectLiteralElement, JSDocContainer, Union.GetAccessorDeclaration_ {
    override val kind: SyntaxKind.GetAccessor
    override val parent: Union.GetAccessorDeclaration_parent
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    override val body: FunctionBody?
}
