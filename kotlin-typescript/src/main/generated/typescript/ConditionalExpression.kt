// Automatically generated - do not modify!

package typescript

external interface ConditionalExpression : Expression {
    override val kind: SyntaxKind.ConditionalExpression
    val condition: Expression
    val questionToken: QuestionToken
    val whenTrue: Expression
    val colonToken: ColonToken
    val whenFalse: Expression
}
