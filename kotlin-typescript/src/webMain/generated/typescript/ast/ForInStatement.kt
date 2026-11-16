// Automatically generated - do not modify!

package typescript.ast

external interface ForInStatement :
    IterationStatement,
    LocalsContainer,
    FlowContainer,
    HasJSDoc,
    HasInitializer,
    VariableDeclarationListParent,
    ForInOrOfStatement {
    override val kind: SyntaxKind.ForInStatement
    val initializer: ForInitializer
    val expression: Expression
}
