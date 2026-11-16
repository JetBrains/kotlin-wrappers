// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.ast.visitor

import typescript.ast.Node
import typescript.ast.SyntaxKind

/**
 * Gets the TextRange to use for source maps for a token of a node.
 */
external fun getTokenSourceMapRange(
    node: Node,
    token: SyntaxKind,
): SourceMapRange?
