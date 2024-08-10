// Automatically generated - do not modify!

package typescript

sealed external interface MethodDeclaration : FunctionLikeDeclarationBase, ClassElement, ObjectLiteralElement,
    JSDocContainer, LocalsContainer, FlowContainer, HasJSDoc, HasDecorators, HasModifiers, SignatureDeclaration,
    ObjectLiteralElementLike, FunctionLikeDeclaration, FlowStartNode, NodeFactoryReplacePropertyNameTConstraint {
    override val kind: SyntaxKind.MethodDeclaration
    override val parent: MethodDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    override val body: FunctionBody?
}
