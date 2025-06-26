// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface RequestCredentials {
    companion object
}

inline val RequestCredentials.Companion.include: RequestCredentials
    get() = unsafeCast("include")

inline val RequestCredentials.Companion.omit: RequestCredentials
    get() = unsafeCast("omit")

inline val RequestCredentials.Companion.sameOrigin: RequestCredentials
    get() = unsafeCast("sameOrigin")
