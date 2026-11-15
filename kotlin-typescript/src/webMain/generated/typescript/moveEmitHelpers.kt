// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Node
import typescript.ast.visitor.EmitHelper

/**
 * Moves matching emit helpers from a source node to a target node.
 */
external fun moveEmitHelpers(
    source: Node,
    target: Node,
    predicate: (helper: EmitHelper) -> Boolean,
)
