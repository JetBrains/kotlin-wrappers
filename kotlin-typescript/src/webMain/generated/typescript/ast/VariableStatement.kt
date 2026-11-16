// Automatically generated - do not modify!

package typescript.ast

external interface VariableStatement :
    Statement,
    FlowContainer,
    HasJSDoc,
    HasModifiers,
    VariableDeclarationListParent {
    override val kind: SyntaxKind.VariableStatement
    val modifiers: NodeArray<ModifierLike>?
    val declarationList: VariableDeclarationList
}
