// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediasource

import js.reflect.unsafeCast

sealed external interface ReadyState {
    companion object
}

inline val ReadyState.Companion.closed: ReadyState
    get() = unsafeCast("closed")

inline val ReadyState.Companion.ended: ReadyState
    get() = unsafeCast("ended")

inline val ReadyState.Companion.open: ReadyState
    get() = unsafeCast("open")
