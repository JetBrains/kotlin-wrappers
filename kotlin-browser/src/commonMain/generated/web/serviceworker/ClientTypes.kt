// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import js.reflect.unsafeCast

sealed external interface ClientTypes {
    companion object
}

inline val ClientTypes.Companion.all: ClientTypes
    get() = unsafeCast("all")

inline val ClientTypes.Companion.sharedworker: ClientTypes
    get() = unsafeCast("sharedworker")

inline val ClientTypes.Companion.window: ClientTypes
    get() = unsafeCast("window")

inline val ClientTypes.Companion.worker: ClientTypes
    get() = unsafeCast("worker")
