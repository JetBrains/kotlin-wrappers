// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
 *
 * @param nodes The NodeArray to visit.
 * @param visitor The callback used to visit a Node.
 * @param test A node test to execute for each node.
 * @param start An optional value indicating the starting offset at which to start visiting.
 * @param count An optional value indicating the maximum number of nodes to visit.
 */
external fun <T : Node> visitNodes(
    nodes: NodeArray<T>,
    visitor: Visitor?,
    test: (node: Node) -> Boolean = definedExternally,
    start: Int = definedExternally,
    count: Int = definedExternally,
): NodeArray<T>

/**
 * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
 *
 * @param nodes The NodeArray to visit.
 * @param visitor The callback used to visit a Node.
 * @param test A node test to execute for each node.
 * @param start An optional value indicating the starting offset at which to start visiting.
 * @param count An optional value indicating the maximum number of nodes to visit.
 */
external fun <T : Node> visitNodes(
    nodes: NodeArray<T>?,
    visitor: Visitor?,
    test: (node: Node) -> Boolean = definedExternally,
    start: Int = definedExternally,
    count: Int = definedExternally,
): NodeArray<T>?
