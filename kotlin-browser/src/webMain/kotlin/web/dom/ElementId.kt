package web.dom

import js.core.StringLike
import js.reflect.unsafeCast

external interface ElementId :
    StringLike

inline fun ElementId(
    value: String,
): ElementId =
    unsafeCast(value)
