// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import js.array.ReadonlyArray

/**
 * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
 *
 * - If the input node is undefined, then the output is undefined.
 * - If the visitor returns undefined, then the output is undefined.
 * - If the output node is not undefined, then it will satisfy the test function.
 * - In order to obtain a return type that is more specific than `Node`, a test
 *   function _must_ be provided, and that function must be a type predicate.
 *
 * @param node The Node to visit.
 * @param visitor The callback used to visit the Node.
 * @param test A callback to execute to verify the Node is valid.
 * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
 */
external fun <TIn : Node?, TVisited : Node?, TOut : Node> visitNode(
    node: TIn,
    visitor: Visitor<TIn & Any, TVisited>,
    test: (node: Node) -> Boolean, /* node is TOut */
    lift: (node: ReadonlyArray<Node>) -> Node = definedExternally,
): Any? /* TOut | (TIn & undefined) | (TVisited & undefined) */

/**
 * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
 *
 * - If the input node is undefined, then the output is undefined.
 * - If the visitor returns undefined, then the output is undefined.
 * - If the output node is not undefined, then it will satisfy the test function.
 * - In order to obtain a return type that is more specific than `Node`, a test
 *   function _must_ be provided, and that function must be a type predicate.
 *
 * @param node The Node to visit.
 * @param visitor The callback used to visit the Node.
 * @param test A callback to execute to verify the Node is valid.
 * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
 */
external fun <TIn : Node?, TVisited : Node?> visitNode(
    node: TIn,
    visitor: Visitor<TIn & Any, TVisited>,
    test: (node: Node) -> Boolean = definedExternally,
    lift: (node: ReadonlyArray<Node>) -> Node = definedExternally,
): Any? /* Node | (TIn & undefined) | (TVisited & undefined) */
