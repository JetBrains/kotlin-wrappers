// Automatically generated - do not modify!

package typescript

sealed external interface ConditionalTypeNode : TypeNode {
    override val kind: SyntaxKind.ConditionalType
    val checkType: TypeNode
    val extendsType: TypeNode
    val trueType: TypeNode
    val falseType: TypeNode
}
