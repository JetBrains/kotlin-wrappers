// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import js.reflect.unsafeCast

sealed external interface ServiceWorkerState {
    companion object
}

inline val ServiceWorkerState.Companion.activated: ServiceWorkerState
    get() = unsafeCast("activated")

inline val ServiceWorkerState.Companion.activating: ServiceWorkerState
    get() = unsafeCast("activating")

inline val ServiceWorkerState.Companion.installed: ServiceWorkerState
    get() = unsafeCast("installed")

inline val ServiceWorkerState.Companion.installing: ServiceWorkerState
    get() = unsafeCast("installing")

inline val ServiceWorkerState.Companion.parsed: ServiceWorkerState
    get() = unsafeCast("parsed")

inline val ServiceWorkerState.Companion.redundant: ServiceWorkerState
    get() = unsafeCast("redundant")
