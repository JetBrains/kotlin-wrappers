// Automatically generated - do not modify!

package web.crypto

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface KeyType

inline val KeyType.Companion.private: KeyType
    get() = unsafeCast("private")

inline val KeyType.Companion.public: KeyType
    get() = unsafeCast("public")

inline val KeyType.Companion.secret: KeyType
    get() = unsafeCast("secret")
