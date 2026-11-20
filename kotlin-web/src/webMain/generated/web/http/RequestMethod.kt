// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods)
 */
@JsUnion
sealed /* union */
external interface RequestMethod

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/CONNECT)
 */
inline val RequestMethod.Companion.CONNECT: RequestMethod
    get() = unsafeCast("CONNECT")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/DELETE)
 */
inline val RequestMethod.Companion.DELETE: RequestMethod
    get() = unsafeCast("DELETE")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/GET)
 */
inline val RequestMethod.Companion.GET: RequestMethod
    get() = unsafeCast("GET")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/HEAD)
 */
inline val RequestMethod.Companion.HEAD: RequestMethod
    get() = unsafeCast("HEAD")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/OPTIONS)
 */
inline val RequestMethod.Companion.OPTIONS: RequestMethod
    get() = unsafeCast("OPTIONS")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/PATCH)
 */
inline val RequestMethod.Companion.PATCH: RequestMethod
    get() = unsafeCast("PATCH")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/POST)
 */
inline val RequestMethod.Companion.POST: RequestMethod
    get() = unsafeCast("POST")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/PUT)
 */
inline val RequestMethod.Companion.PUT: RequestMethod
    get() = unsafeCast("PUT")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/HTTP/Reference/Methods/QUERY)
 */
inline val RequestMethod.Companion.QUERY: RequestMethod
    get() = unsafeCast("QUERY")
