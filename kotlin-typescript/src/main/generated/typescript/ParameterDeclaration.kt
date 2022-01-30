// Automatically generated - do not modify!

package typescript

sealed external interface ParameterDeclaration : NamedDeclaration, JSDocContainer, Union.ParameterDeclaration_ {
    override val kind: SyntaxKind.Parameter
    override val parent: SignatureDeclaration
    val dotDotDotToken: DotDotDotToken?
    override val name: BindingName
    val questionToken: QuestionToken?
    val type: TypeNode?
    val initializer: Expression?
}
