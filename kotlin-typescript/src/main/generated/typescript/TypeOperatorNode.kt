// Automatically generated - do not modify!

package typescript

sealed external interface TypeOperatorNode : TypeNode {
    override val kind: SyntaxKind.TypeOperator
    val operator: dynamic /* SyntaxKind.KeyOfKeyword | SyntaxKind.UniqueKeyword | SyntaxKind.ReadonlyKeyword */
    val type: TypeNode
}
