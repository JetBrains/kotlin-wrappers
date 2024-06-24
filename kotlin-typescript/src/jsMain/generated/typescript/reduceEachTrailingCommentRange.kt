// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

external fun <T, U> reduceEachTrailingCommentRange(
    text: String,
    pos: Double,
    cb: (pos: Double, end: Double, kind: CommentKind, hasTrailingNewLine: Boolean, state: T) -> U,
    state: T,
    initial: U,
): U?
