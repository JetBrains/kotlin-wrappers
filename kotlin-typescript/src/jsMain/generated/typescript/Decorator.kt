// Automatically generated - do not modify!

package typescript

sealed external interface Decorator : Node, ModifierLike, CallLikeExpression {
    override val kind: SyntaxKind.Decorator
    override val parent: NamedDeclaration
    val expression: LeftHandSideExpression
}
