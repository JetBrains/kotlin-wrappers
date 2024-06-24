// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

external fun <T : Node> addSyntheticTrailingComment(
    node: T,
    kind: SyntaxKind.SingleLineCommentTrivia,
    text: String,
    hasTrailingNewLine: Boolean = definedExternally,
): T

external fun <T : Node> addSyntheticTrailingComment(
    node: T,
    kind: SyntaxKind.MultiLineCommentTrivia,
    text: String,
    hasTrailingNewLine: Boolean = definedExternally,
): T
