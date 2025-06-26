// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface SelectionMode {
    companion object
}

inline val SelectionMode.Companion.end: SelectionMode
    get() = unsafeCast("end")

inline val SelectionMode.Companion.preserve: SelectionMode
    get() = unsafeCast("preserve")

inline val SelectionMode.Companion.select: SelectionMode
    get() = unsafeCast("select")

inline val SelectionMode.Companion.start: SelectionMode
    get() = unsafeCast("start")
