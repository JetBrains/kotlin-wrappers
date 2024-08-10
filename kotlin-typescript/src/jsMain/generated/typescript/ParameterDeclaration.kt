// Automatically generated - do not modify!

package typescript

sealed external interface ParameterDeclaration : NamedDeclaration, JSDocContainer, HasJSDoc, HasType,
    HasExpressionInitializer, HasDecorators, HasModifiers, VariableLikeDeclaration, ObjectBindingPatternParent,
    ArrayBindingPatternParent, SyntheticExpressionTupleNameSource, BindingOrAssignmentElement,
    WalkUpBindingElementsAndPatternsResult {
    override val kind: SyntaxKind.Parameter
    override val parent: SignatureDeclaration
    val modifiers: NodeArray<ModifierLike>?
    val dotDotDotToken: DotDotDotToken?
    override val name: BindingName
    val questionToken: QuestionToken?
    val type: TypeNode?
    val initializer: Expression?
}
