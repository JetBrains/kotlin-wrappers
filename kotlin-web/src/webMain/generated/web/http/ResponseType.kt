// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ResponseType

inline val ResponseType.Companion.basic: ResponseType
    get() = unsafeCast("basic")

inline val ResponseType.Companion.cors: ResponseType
    get() = unsafeCast("cors")

inline val ResponseType.Companion.default: ResponseType
    get() = unsafeCast("default")

inline val ResponseType.Companion.error: ResponseType
    get() = unsafeCast("error")

inline val ResponseType.Companion.opaque: ResponseType
    get() = unsafeCast("opaque")

inline val ResponseType.Companion.opaqueredirect: ResponseType
    get() = unsafeCast("opaqueredirect")
