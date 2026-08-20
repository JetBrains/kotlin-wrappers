// Automatically generated - do not modify!

package web.serviceworker

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state)
 */
@JsUnion
sealed /* union */
external interface ServiceWorkerState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state#activated)
 */
inline val ServiceWorkerState.Companion.activated: ServiceWorkerState
    get() = unsafeCast("activated")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state#activating)
 */
inline val ServiceWorkerState.Companion.activating: ServiceWorkerState
    get() = unsafeCast("activating")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state#installed)
 */
inline val ServiceWorkerState.Companion.installed: ServiceWorkerState
    get() = unsafeCast("installed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state#installing)
 */
inline val ServiceWorkerState.Companion.installing: ServiceWorkerState
    get() = unsafeCast("installing")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state#parsed)
 */
inline val ServiceWorkerState.Companion.parsed: ServiceWorkerState
    get() = unsafeCast("parsed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state#redundant)
 */
inline val ServiceWorkerState.Companion.redundant: ServiceWorkerState
    get() = unsafeCast("redundant")
