// Automatically generated - do not modify!

package web.serviceworker

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache)
 */
@JsUnion
sealed /* union */
external interface ServiceWorkerUpdateViaCache

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache#all)
 */
inline val ServiceWorkerUpdateViaCache.Companion.all: ServiceWorkerUpdateViaCache
    get() = unsafeCast("all")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache#imports)
 */
inline val ServiceWorkerUpdateViaCache.Companion.imports: ServiceWorkerUpdateViaCache
    get() = unsafeCast("imports")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache#none)
 */
inline val ServiceWorkerUpdateViaCache.Companion.none: ServiceWorkerUpdateViaCache
    get() = unsafeCast("none")
