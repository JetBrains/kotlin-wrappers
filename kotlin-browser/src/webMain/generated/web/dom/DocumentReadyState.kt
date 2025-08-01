// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.dom

import js.reflect.unsafeCast

sealed external interface DocumentReadyState {
    companion object
}

inline val DocumentReadyState.Companion.complete: DocumentReadyState
    get() = unsafeCast("complete")

inline val DocumentReadyState.Companion.interactive: DocumentReadyState
    get() = unsafeCast("interactive")

inline val DocumentReadyState.Companion.loading: DocumentReadyState
    get() = unsafeCast("loading")
