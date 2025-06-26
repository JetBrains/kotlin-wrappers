// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.crypto

import js.reflect.unsafeCast

sealed external interface KeyUsage {
    companion object
}

inline val KeyUsage.Companion.decrypt: KeyUsage
    get() = unsafeCast("decrypt")

inline val KeyUsage.Companion.deriveBits: KeyUsage
    get() = unsafeCast("deriveBits")

inline val KeyUsage.Companion.deriveKey: KeyUsage
    get() = unsafeCast("deriveKey")

inline val KeyUsage.Companion.encrypt: KeyUsage
    get() = unsafeCast("encrypt")

inline val KeyUsage.Companion.sign: KeyUsage
    get() = unsafeCast("sign")

inline val KeyUsage.Companion.unwrapKey: KeyUsage
    get() = unsafeCast("unwrapKey")

inline val KeyUsage.Companion.verify: KeyUsage
    get() = unsafeCast("verify")

inline val KeyUsage.Companion.wrapKey: KeyUsage
    get() = unsafeCast("wrapKey")
