// Automatically generated - do not modify!

package typescript.ast.visitor

import typescript.ast.Node
import typescript.ast.NodeArray

external interface VisitEachChildNodesVisitor {
    operator fun <TIn : Node, TInArray : NodeArray<TIn>?, TOut : Node> invoke(
        nodes: TInArray,
        visitor: Visitor<TIn, Node?>,
        test: (node: Node) -> Boolean, /* node is TOut */
        start: Int? = definedExternally,
        count: Int? = definedExternally,
    ): Any /* NodeArray<TOut> | (TInArray & undefined) */

    operator fun <TIn : Node, TInArray : NodeArray<TIn>?> invoke(
        nodes: TInArray,
        visitor: Visitor<TIn, Node?>,
        test: (
            (node: Node) -> Boolean
        )? = definedExternally,
        start: Int? = definedExternally,
        count: Int? = definedExternally,
    ): Any /* NodeArray<Node> | (TInArray & undefined) */
}
