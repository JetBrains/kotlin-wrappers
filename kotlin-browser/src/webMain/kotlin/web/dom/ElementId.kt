package web.dom

import js.reflect.unsafeCast
import js.string.StringLike

external interface ElementId :
    StringLike

inline fun ElementId(
    value: String,
): ElementId =
    unsafeCast(value)
