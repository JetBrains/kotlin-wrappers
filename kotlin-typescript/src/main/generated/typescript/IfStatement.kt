// Automatically generated - do not modify!

package typescript

sealed external interface IfStatement : Statement {
    override val kind: SyntaxKind.IfStatement
    val expression: Expression
    val thenStatement: Statement
    val elseStatement: Statement?
}
