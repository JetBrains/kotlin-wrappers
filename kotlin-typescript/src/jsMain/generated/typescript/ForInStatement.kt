// Automatically generated - do not modify!

package typescript

sealed external interface ForInStatement : IterationStatement, LocalsContainer, FlowContainer, Union.ForInStatement_ {
    override val kind: SyntaxKind.ForInStatement
    val initializer: ForInitializer
    val expression: Expression
}
