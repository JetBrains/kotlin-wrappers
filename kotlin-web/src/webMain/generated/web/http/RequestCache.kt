// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache)
 */
@JsUnion
sealed /* union */
external interface RequestCache

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache#default)
 */
inline val RequestCache.Companion.default: RequestCache
    get() = unsafeCast("default")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache#force-cache)
 */
inline val RequestCache.Companion.forceCache: RequestCache
    get() = unsafeCast("force-cache")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache#no-cache)
 */
inline val RequestCache.Companion.noCache: RequestCache
    get() = unsafeCast("no-cache")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache#no-store)
 */
inline val RequestCache.Companion.noStore: RequestCache
    get() = unsafeCast("no-store")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache#only-if-cached)
 */
inline val RequestCache.Companion.onlyIfCached: RequestCache
    get() = unsafeCast("only-if-cached")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache#reload)
 */
inline val RequestCache.Companion.reload: RequestCache
    get() = unsafeCast("reload")
