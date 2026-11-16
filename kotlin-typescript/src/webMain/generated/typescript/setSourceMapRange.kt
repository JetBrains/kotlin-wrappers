// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Node
import typescript.ast.visitor.SourceMapRange

/**
 * Sets a custom text range to use when emitting source maps.
 */
external fun <T : Node> setSourceMapRange(
    node: T,
    range: SourceMapRange?,
): T
