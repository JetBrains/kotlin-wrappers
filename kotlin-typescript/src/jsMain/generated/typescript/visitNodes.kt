// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
 *
 * - If the input node array is undefined, the output is undefined.
 * - If the visitor can return undefined, the node it visits in the array will be reused.
 * - If the output node array is not undefined, then its contents will satisfy the test.
 * - In order to obtain a return type that is more specific than `NodeArray<Node>`, a test
 *   function _must_ be provided, and that function must be a type predicate.
 *
 * @param nodes The NodeArray to visit.
 * @param visitor The callback used to visit a Node.
 * @param test A node test to execute for each node.
 * @param start An optional value indicating the starting offset at which to start visiting.
 * @param count An optional value indicating the maximum number of nodes to visit.
 */
external fun <TIn : Node, TInArray : NodeArray<TIn>?> visitNodes(
    nodes: TInArray,
    visitor: Visitor<TIn, Node?>,
    test: (node: Node) -> Boolean = definedExternally,
    start: Int = definedExternally,
    count: Int = definedExternally,
): dynamic /* NodeArray<Node> | (TInArray & undefined) */
