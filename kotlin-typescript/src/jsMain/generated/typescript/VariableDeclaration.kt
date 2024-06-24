// Automatically generated - do not modify!

package typescript

sealed external interface VariableDeclaration : NamedDeclaration, JSDocContainer, HasJSDoc, HasType,
    HasExpressionInitializer, VariableLikeDeclaration, ObjectBindingPatternParent, ArrayBindingPatternParent,
    BindingOrAssignmentElement, FlowAssignmentNode, WalkUpBindingElementsAndPatternsResult {
    override val kind: SyntaxKind.VariableDeclaration
    override val parent: VariableDeclarationParent
    override val name: BindingName
    val exclamationToken: ExclamationToken?
    val type: TypeNode?
    val initializer: Expression?
}
