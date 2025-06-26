// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface ResponseType {
    companion object
}

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
