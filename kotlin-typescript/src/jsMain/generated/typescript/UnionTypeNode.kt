// Automatically generated - do not modify!

package typescript

sealed external interface UnionTypeNode : TypeNode, UnionOrIntersectionTypeNode {
    override val kind: SyntaxKind.UnionType
    val types: NodeArray<TypeNode>
}
