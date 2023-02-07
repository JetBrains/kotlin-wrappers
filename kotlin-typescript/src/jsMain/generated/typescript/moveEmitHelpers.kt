// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Moves matching emit helpers from a source node to a target node.
 */
external fun moveEmitHelpers(
    source: Node,
    target: Node,
    predicate: (helper: EmitHelper) -> Boolean,
)
