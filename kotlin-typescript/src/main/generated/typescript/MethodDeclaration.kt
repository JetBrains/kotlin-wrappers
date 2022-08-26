// Automatically generated - do not modify!

package typescript

sealed external interface MethodDeclaration : FunctionLikeDeclarationBase, ClassElement, ObjectLiteralElement,
    JSDocContainer, Union.MethodDeclaration_ {
    override val kind: SyntaxKind.MethodDeclaration
    override val parent: Union.MethodDeclaration_parent
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    override val body: FunctionBody?
}
