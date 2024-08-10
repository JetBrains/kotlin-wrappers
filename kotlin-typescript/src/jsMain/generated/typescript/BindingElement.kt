// Automatically generated - do not modify!

package typescript

sealed external interface BindingElement : NamedDeclaration, FlowContainer, HasExpressionInitializer,
    VariableLikeDeclaration, ObjectBindingPatternParent, ArrayBindingPatternParent, ArrayBindingElement,
    ObjectBindingOrAssignmentElement, FlowAssignmentNode {
    override val kind: SyntaxKind.BindingElement
    override val parent: BindingPattern
    val propertyName: PropertyName?
    val dotDotDotToken: DotDotDotToken?
    override val name: BindingName
    val initializer: Expression?
}
