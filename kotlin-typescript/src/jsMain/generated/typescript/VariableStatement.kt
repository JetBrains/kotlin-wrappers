// Automatically generated - do not modify!

package typescript

sealed external interface VariableStatement : Statement, FlowContainer, HasJSDoc, HasModifiers,
    VariableDeclarationListParent {
    override val kind: SyntaxKind.VariableStatement
    val modifiers: NodeArray<ModifierLike>?
    val declarationList: VariableDeclarationList
}
