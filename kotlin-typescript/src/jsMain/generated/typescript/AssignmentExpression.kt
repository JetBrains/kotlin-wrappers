// Automatically generated - do not modify!

package typescript

sealed external interface AssignmentExpression<TOperator : AssignmentOperatorToken> : BinaryExpression {
    override val left: LeftHandSideExpression
    override val operatorToken: TOperator
}
