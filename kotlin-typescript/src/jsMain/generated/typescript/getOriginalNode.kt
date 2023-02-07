// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

external fun getOriginalNode(node: Node): Node

external fun <T : Node> getOriginalNode(
    node: Node,
    nodeTest: (node: Node) -> Boolean, /* node is T */
): T

external fun getOriginalNode(node: Node?): Node?

external fun <T : Node> getOriginalNode(
    node: Node?,
    nodeTest: dynamic, /* (node: Node | undefined) => node is T */
): T?
