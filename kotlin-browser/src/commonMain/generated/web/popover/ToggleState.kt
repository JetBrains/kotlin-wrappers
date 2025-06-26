// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.popover

import js.reflect.unsafeCast

sealed external interface ToggleState {
    companion object
}

inline val ToggleState.Companion.open: ToggleState
    get() = unsafeCast("open")

inline val ToggleState.Companion.closed: ToggleState
    get() = unsafeCast("closed")
