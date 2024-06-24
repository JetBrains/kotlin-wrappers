// Automatically generated - do not modify!

package typescript

sealed external interface ForOfStatement : IterationStatement, LocalsContainer, FlowContainer, HasJSDoc, HasInitializer,
    VariableDeclarationListParent, ForInOrOfStatement {
    override val kind: SyntaxKind.ForOfStatement
    val awaitModifier: AwaitKeyword?
    val initializer: ForInitializer
    val expression: Expression
}
