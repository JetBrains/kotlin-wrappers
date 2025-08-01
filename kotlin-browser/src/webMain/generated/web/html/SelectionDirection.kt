// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface SelectionDirection {
    companion object
}

inline val SelectionDirection.Companion.forward: SelectionDirection
    get() = unsafeCast("forward")

inline val SelectionDirection.Companion.backward: SelectionDirection
    get() = unsafeCast("backward")

inline val SelectionDirection.Companion.none: SelectionDirection
    get() = unsafeCast("none")
