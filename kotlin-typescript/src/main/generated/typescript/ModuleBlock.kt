// Automatically generated - do not modify!

package typescript

sealed external interface ModuleBlock : Node, Statement, Union.ModuleBlock_ {
    override val kind: SyntaxKind.ModuleBlock
    override val parent: ModuleDeclaration
    val statements: NodeArray<Statement>
}
