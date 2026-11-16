// Automatically generated - do not modify!

package typescript.ast

external interface ArrayBindingPattern :
    Node,
    BindingPattern,
    ArrayBindingOrAssignmentPattern {
    override val kind: SyntaxKind.ArrayBindingPattern
    override val parent: ArrayBindingPatternParent?
    val elements: NodeArray<ArrayBindingElement>
}
