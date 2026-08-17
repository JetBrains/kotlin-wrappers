// Automatically generated - do not modify!

package web.serviceworker

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ServiceWorkerState

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
