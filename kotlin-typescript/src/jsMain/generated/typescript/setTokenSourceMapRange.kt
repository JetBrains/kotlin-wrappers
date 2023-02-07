// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Sets the TextRange to use for source maps for a token of a node.
 */
external fun <T : Node> setTokenSourceMapRange(
    node: T,
    token: SyntaxKind,
    range: SourceMapRange?,
): T
