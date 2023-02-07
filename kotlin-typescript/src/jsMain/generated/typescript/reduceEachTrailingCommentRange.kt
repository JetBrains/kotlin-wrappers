// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

external fun <T, U> reduceEachTrailingCommentRange(
    text: String,
    pos: Int,
    cb: (
        pos: Int,
        end: Int,
        kind: CommentKind,
        hasTrailingNewLine: Boolean,
        state: T,
        memo: U,
    ) -> U,
    state: T,
    initial: U,
): U?
