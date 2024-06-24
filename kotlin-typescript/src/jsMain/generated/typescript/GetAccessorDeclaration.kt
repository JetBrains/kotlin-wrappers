// Automatically generated - do not modify!

package typescript

sealed external interface GetAccessorDeclaration : FunctionLikeDeclarationBase, ClassElement, TypeElement,
    ObjectLiteralElement, JSDocContainer, LocalsContainer, FlowContainer, HasDecorators, HasModifiers,
    FunctionLikeDeclaration, AccessorDeclaration, FlowStartNode {
    override val kind: SyntaxKind.GetAccessor
    override val parent: GetAccessorDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    override val body: FunctionBody?
}
