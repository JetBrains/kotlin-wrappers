// Automatically generated - do not modify!

package typescript

external interface ForStatement :
    IterationStatement,
    LocalsContainer,
    FlowContainer,
    HasJSDoc,
    HasInitializer,
    VariableDeclarationListParent {
    override val kind: SyntaxKind.ForStatement
    val initializer: ForInitializer?
    val condition: Expression?
    val incrementor: Expression?
}
