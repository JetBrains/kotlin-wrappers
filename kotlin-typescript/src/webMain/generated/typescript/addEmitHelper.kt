// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Node
import typescript.ast.visitor.EmitHelper

/**
 * Adds an EmitHelper to a node.
 */
external fun <T : Node> addEmitHelper(
    node: T,
    helper: EmitHelper,
): T
