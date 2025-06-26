// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface CrossOrigin {
    companion object
}

inline val CrossOrigin.Companion.anonymous: CrossOrigin
    get() = unsafeCast("anonymous")

inline val CrossOrigin.Companion.useCredentials: CrossOrigin
    get() = unsafeCast("use-credentials")

inline val CrossOrigin.Companion.none: CrossOrigin
    get() = unsafeCast("")
