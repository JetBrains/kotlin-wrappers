// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
 *
 * @param node The Node to visit.
 * @param visitor The callback used to visit the Node.
 * @param test A callback to execute to verify the Node is valid.
 * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
 */
external fun <T : Node> visitNode(
    node: T,
    visitor: Visitor?,
    test: (node: Node) -> Boolean = definedExternally,
    lift: (node: ReadonlyArray<Node>) -> T = definedExternally,
): T

/**
 * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
 *
 * @param node The Node to visit.
 * @param visitor The callback used to visit the Node.
 * @param test A callback to execute to verify the Node is valid.
 * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
 */
external fun <T : Node> visitNode(
    node: T?,
    visitor: Visitor?,
    test: (node: Node) -> Boolean = definedExternally,
    lift: (node: ReadonlyArray<Node>) -> T = definedExternally,
): T?
