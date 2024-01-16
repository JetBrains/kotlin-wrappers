// Automatically generated - do not modify!

package typescript

sealed external interface QualifiedName : Node, FlowContainer, Union.QualifiedName_ {
    override val kind: SyntaxKind.QualifiedName
    val left: EntityName
    val right: Identifier
}
