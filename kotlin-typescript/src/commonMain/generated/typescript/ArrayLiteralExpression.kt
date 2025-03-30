// Automatically generated - do not modify!

package typescript

sealed external interface ArrayLiteralExpression : PrimaryExpression, ArrayBindingOrAssignmentPattern,
    AssignmentPattern, SpreadElementParent, JsonObjectExpression, DestructuringPattern {
    override val kind: SyntaxKind.ArrayLiteralExpression
    val elements: NodeArray<Expression>
}
