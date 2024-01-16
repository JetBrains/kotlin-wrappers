// Automatically generated - do not modify!

package typescript

sealed external interface VariableStatement : Statement, FlowContainer, Union.VariableStatement_ {
    override val kind: SyntaxKind.VariableStatement
    val modifiers: NodeArray<ModifierLike>?
    val declarationList: VariableDeclarationList
}
