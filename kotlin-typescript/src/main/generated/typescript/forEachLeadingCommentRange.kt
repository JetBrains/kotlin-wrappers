// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

external fun <U> forEachLeadingCommentRange(
    text: String,
    pos: Int,
    cb: (
        pos: Int,
        end: Int,
        kind: CommentKind,
        hasTrailingNewLine: Boolean,
    ) -> U,
): U?

external fun <T, U> forEachLeadingCommentRange(
    text: String,
    pos: Int,
    cb: (
        pos: Int,
        end: Int,
        kind: CommentKind,
        hasTrailingNewLine: Boolean,
        state: T,
    ) -> U,
    state: T,
): U?
