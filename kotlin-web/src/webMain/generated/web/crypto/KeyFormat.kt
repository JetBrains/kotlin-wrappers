// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.crypto

import js.reflect.unsafeCast

sealed external interface KeyFormat {
    sealed interface jwk : KeyFormat
    sealed interface pkcs8 : KeyFormat
    sealed interface raw : KeyFormat
    sealed interface spki : KeyFormat

    companion object
}

inline val KeyFormat.Companion.jwk: KeyFormat.jwk
    get() = unsafeCast("jwk")

inline val KeyFormat.Companion.pkcs8: KeyFormat.pkcs8
    get() = unsafeCast("pkcs8")

inline val KeyFormat.Companion.raw: KeyFormat.raw
    get() = unsafeCast("raw")

inline val KeyFormat.Companion.spki: KeyFormat.spki
    get() = unsafeCast("spki")
