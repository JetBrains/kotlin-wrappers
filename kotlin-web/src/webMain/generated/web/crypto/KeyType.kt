// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.crypto

import js.reflect.unsafeCast

sealed external interface KeyType {
    companion object
}

inline val KeyType.Companion.private: KeyType
    get() = unsafeCast("private")

inline val KeyType.Companion.public: KeyType
    get() = unsafeCast("public")

inline val KeyType.Companion.secret: KeyType
    get() = unsafeCast("secret")
