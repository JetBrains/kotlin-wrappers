// Automatically generated - do not modify!

package typescript

sealed external interface SetAccessorDeclaration : FunctionLikeDeclarationBase, ClassElement, TypeElement,
    ObjectLiteralElement, JSDocContainer, LocalsContainer, FlowContainer, HasDecorators, HasModifiers,
    FunctionLikeDeclaration, AccessorDeclaration, FlowStartNode {
    override val kind: SyntaxKind.SetAccessor
    override val parent: SetAccessorDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    override val body: FunctionBody?
}
