// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Iterates through the parent chain of a node and performs the callback on each parent until the callback
 * returns a truthy value, then returns that value.
 * If no such value is found, it applies the callback until the parent pointer is undefined or the callback returns "quit"
 * At that point findAncestor returns undefined.
 */
external fun <T : Node> findAncestor(
    node: Node?,
    callback: (element: Node) -> Boolean, /* element is T */
): T?

external fun findAncestor(
    node: Node?,
    callback: dynamic, /* (element: Node) => boolean | "quit" */
): Node?
