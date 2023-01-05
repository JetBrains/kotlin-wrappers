// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.window

sealed external interface WindowName :
    WindowTarget

inline fun WindowName(
    value: String,
): WindowName =
    value.unsafeCast<WindowName>()
