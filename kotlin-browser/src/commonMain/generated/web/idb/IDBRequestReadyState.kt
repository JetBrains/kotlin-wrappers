// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import js.reflect.unsafeCast

sealed external interface IDBRequestReadyState {
    companion object
}

inline val IDBRequestReadyState.Companion.done: IDBRequestReadyState
    get() = unsafeCast("done")

inline val IDBRequestReadyState.Companion.pending: IDBRequestReadyState
    get() = unsafeCast("pending")
