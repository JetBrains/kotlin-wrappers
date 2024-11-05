// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.window

import js.reflect.unsafeCast

sealed external interface WindowName :
    WindowTarget

inline fun WindowName(
    value: String,
): WindowName =
    unsafeCast(value)
