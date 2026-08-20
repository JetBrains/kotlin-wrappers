// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type)
 */
@JsUnion
sealed /* union */
external interface ResponseType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type#basic)
 */
inline val ResponseType.Companion.basic: ResponseType
    get() = unsafeCast("basic")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type#cors)
 */
inline val ResponseType.Companion.cors: ResponseType
    get() = unsafeCast("cors")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type#default)
 */
inline val ResponseType.Companion.default: ResponseType
    get() = unsafeCast("default")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type#error)
 */
inline val ResponseType.Companion.error: ResponseType
    get() = unsafeCast("error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type#opaque)
 */
inline val ResponseType.Companion.opaque: ResponseType
    get() = unsafeCast("opaque")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type#opaqueredirect)
 */
inline val ResponseType.Companion.opaqueredirect: ResponseType
    get() = unsafeCast("opaqueredirect")
