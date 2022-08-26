// Automatically generated - do not modify!

package typescript

sealed external interface PropertySignature : TypeElement, JSDocContainer, Union.PropertySignature_ {
    override val kind: SyntaxKind.PropertySignature
    val modifiers: NodeArray<Modifier>?
    override val name: PropertyName
    override val questionToken: QuestionToken?
    val type: TypeNode?

}
