// Automatically generated - do not modify!

package typescript.ast

external interface ObjectBindingPattern :
    Node,
    BindingPattern,
    ObjectBindingOrAssignmentPattern {
    override val kind: SyntaxKind.ObjectBindingPattern
    override val parent: ObjectBindingPatternParent?
    val elements: NodeArray<BindingElement>
}
