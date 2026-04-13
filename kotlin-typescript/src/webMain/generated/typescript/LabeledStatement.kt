// Automatically generated - do not modify!

package typescript

external interface LabeledStatement :
    Statement,
    FlowContainer,
    HasJSDoc,
    IsIterationStatementResultPredicate {
    override val kind: SyntaxKind.LabeledStatement
    val label: Identifier
    val statement: Statement
}
