// Automatically generated - do not modify!

package typescript

sealed external interface TypeOperatorNode : TypeNode, HasType {
    override val kind: SyntaxKind.TypeOperator
    val operator: TypeOperatorNodeOperator
    val type: TypeNode
}
