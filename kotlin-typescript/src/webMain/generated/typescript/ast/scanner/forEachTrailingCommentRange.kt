// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.ast.scanner

import typescript.ast.CommentKind

external fun <U> forEachTrailingCommentRange(
    text: String,
    pos: Int,
    cb: (pos: Int, end: Int, kind: CommentKind, hasTrailingNewLine: Boolean) -> U,
): U?

external fun <T, U> forEachTrailingCommentRange(
    text: String,
    pos: Int,
    cb: (pos: Int, end: Int, kind: CommentKind, hasTrailingNewLine: Boolean, state: T) -> U,
    state: T,
): U?
