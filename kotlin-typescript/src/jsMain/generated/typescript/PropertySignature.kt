// Automatically generated - do not modify!

package typescript

sealed external interface PropertySignature : TypeElement, JSDocContainer, HasJSDoc, HasType, HasModifiers,
    VariableLikeDeclaration, NodeFactoryReplacePropertyNameTConstraint {
    override val kind: SyntaxKind.PropertySignature
    override val parent: PropertySignatureParent
    val modifiers: NodeArray<Modifier>?
    override val name: PropertyName
    override val questionToken: QuestionToken?
    val type: TypeNode?
}
