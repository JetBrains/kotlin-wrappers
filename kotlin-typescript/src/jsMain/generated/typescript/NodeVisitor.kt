// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

/**
 * A function that walks a node using the given visitor, lifting node arrays into single nodes,
 * returning an node which satisfies the test.
 *
 * - If the input node is undefined, then the output is undefined.
 * - If the visitor returns undefined, then the output is undefined.
 * - If the output node is not undefined, then it will satisfy the test function.
 * - In order to obtain a return type that is more specific than `Node`, a test
 *   function _must_ be provided, and that function must be a type predicate.
 *
 * For the canonical implementation of this type, @see {visitNode}.
 */
sealed external interface NodeVisitor {
    fun <TIn : Node?, TVisited : Node?, TOut : Node> /* native */ invoke(
        node: TIn,
        visitor: Visitor<TIn & Any, TVisited>,
        test: (node: Node) -> Boolean, /* node is TOut */
        lift: (node: ReadonlyArray<Node>) -> Node = definedExternally,
    ): dynamic /* TOut | (TIn & undefined) | (TVisited & undefined) */

    fun <TIn : Node?, TVisited : Node?> /* native */ invoke(
        node: TIn,
        visitor: Visitor<TIn & Any, TVisited>,
        test: (node: Node) -> Boolean = definedExternally,
        lift: (node: ReadonlyArray<Node>) -> Node = definedExternally,
    ): dynamic /* Node | (TIn & undefined) | (TVisited & undefined) */
}
