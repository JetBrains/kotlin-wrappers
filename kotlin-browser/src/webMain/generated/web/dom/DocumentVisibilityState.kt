// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.dom

import js.reflect.unsafeCast

sealed external interface DocumentVisibilityState {
    companion object
}

inline val DocumentVisibilityState.Companion.hidden: DocumentVisibilityState
    get() = unsafeCast("hidden")

inline val DocumentVisibilityState.Companion.visible: DocumentVisibilityState
    get() = unsafeCast("visible")
