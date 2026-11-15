// Automatically generated - do not modify!

package typescript.ast

external interface VariableDeclarationList :
    Node,
    VariableDeclarationParent,
    ForInitializer {
    override val kind: SyntaxKind.VariableDeclarationList
    override val parent: VariableDeclarationListParent?
    val declarations: NodeArray<VariableDeclaration>
}
