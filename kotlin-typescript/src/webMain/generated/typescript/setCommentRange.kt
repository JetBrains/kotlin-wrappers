// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Node
import typescript.ast.TextRange

/**
 * Sets a custom text range to use when emitting comments.
 */
external fun <T : Node> setCommentRange(
    node: T,
    range: TextRange,
): T
