// Automatically generated - do not modify!

package typescript

sealed external interface VariableDeclaration : NamedDeclaration, JSDocContainer, Union.VariableDeclaration_ {
    override val kind: SyntaxKind.VariableDeclaration
    override val parent: Union.VariableDeclaration_parent
    override val name: BindingName
    val exclamationToken: ExclamationToken?
    val type: TypeNode?
    val initializer: Expression?
}
