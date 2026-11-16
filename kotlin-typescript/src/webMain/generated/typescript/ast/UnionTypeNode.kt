// Automatically generated - do not modify!

package typescript.ast

external interface UnionTypeNode :
    TypeNode,
    UnionOrIntersectionTypeNode {
    override val kind: SyntaxKind.UnionType
    val types: NodeArray<TypeNode>
}
