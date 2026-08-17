// Automatically generated - do not modify!

package web.crypto

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface KeyFormat {
    sealed interface jwk : KeyFormat
    sealed interface pkcs8 : KeyFormat
    sealed interface raw : KeyFormat
    sealed interface spki : KeyFormat
}

inline val KeyFormat.Companion.jwk: KeyFormat.jwk
    get() = unsafeCast("jwk")

inline val KeyFormat.Companion.pkcs8: KeyFormat.pkcs8
    get() = unsafeCast("pkcs8")

inline val KeyFormat.Companion.raw: KeyFormat.raw
    get() = unsafeCast("raw")

inline val KeyFormat.Companion.spki: KeyFormat.spki
    get() = unsafeCast("spki")
