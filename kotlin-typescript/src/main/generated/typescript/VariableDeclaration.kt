// Automatically generated - do not modify!

package typescript

sealed external interface VariableDeclaration : NamedDeclaration, JSDocContainer {
    override val kind: SyntaxKind.VariableDeclaration
    override val parent: dynamic /* VariableDeclarationList | CatchClause */
    override val name: BindingName
    val exclamationToken: ExclamationToken?
    val type: TypeNode?
    val initializer: Expression?
}
