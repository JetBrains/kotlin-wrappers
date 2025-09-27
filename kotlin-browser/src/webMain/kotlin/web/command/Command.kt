package web.command

import js.core.StringLike
import js.reflect.unsafeCast

external interface Command :
    StringLike

inline fun Command(
    value: String,
): Command =
    unsafeCast(value)
