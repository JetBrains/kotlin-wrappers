// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

external fun <U> forEachLeadingCommentRange(
    text: String,
    pos: Double,
    cb: (pos: Double, end: Double, kind: CommentKind, hasTrailingNewLine: Boolean) -> U,
): U?

external fun <T, U> forEachLeadingCommentRange(
    text: String,
    pos: Double,
    cb: (pos: Double, end: Double, kind: CommentKind, hasTrailingNewLine: Boolean, state: T) -> U,
    state: T,
): U?
