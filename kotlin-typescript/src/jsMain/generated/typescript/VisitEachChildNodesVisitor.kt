// Automatically generated - do not modify!

package typescript

sealed external interface VisitEachChildNodesVisitor {
    @seskar.js.JsNative
    operator fun <TIn : Node, TInArray : NodeArray<TIn>?, TOut : Node> invoke(
        nodes: TInArray,
        visitor: Visitor<TIn, Node?>,
        test: (node: Node) -> Boolean, /* node is TOut */
        start: Double? = definedExternally,
        count: Double? = definedExternally,
    ): Any /* NodeArray<TOut> | (TInArray & undefined) */

    @seskar.js.JsNative
    operator fun <TIn : Node, TInArray : NodeArray<TIn>?> invoke(
        nodes: TInArray,
        visitor: Visitor<TIn, Node?>,
        test: ((node: Node) -> Boolean)? = definedExternally,
        start: Double? = definedExternally,
        count: Double? = definedExternally,
    ): Any /* NodeArray<Node> | (TInArray & undefined) */
}
