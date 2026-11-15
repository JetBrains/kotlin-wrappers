// Automatically generated - do not modify!

package typescript.ast

external interface ConditionalTypeNode :
    TypeNode,
    LocalsContainer {
    override val kind: SyntaxKind.ConditionalType
    val checkType: TypeNode
    val extendsType: TypeNode
    val trueType: TypeNode
    val falseType: TypeNode
}
