// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Gets the original parse tree node for a node.
 *
 * @param node The original node.
 * @returns The original parse tree node if found; otherwise, undefined.
 */
external fun getParseTreeNode(node: Node?): Node?

/**
 * Gets the original parse tree node for a node.
 *
 * @param node The original node.
 * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
 * @returns The original parse tree node if found; otherwise, undefined.
 */
external fun <T : Node> getParseTreeNode(
    node: T?,
    nodeTest: (node: Node) -> Boolean /* node is T */ = definedExternally,
): T?
