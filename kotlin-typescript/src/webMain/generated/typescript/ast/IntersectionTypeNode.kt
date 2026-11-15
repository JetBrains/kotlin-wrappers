// Automatically generated - do not modify!

package typescript.ast

external interface IntersectionTypeNode :
    TypeNode,
    UnionOrIntersectionTypeNode {
    override val kind: SyntaxKind.IntersectionType
    val types: NodeArray<TypeNode>
}
