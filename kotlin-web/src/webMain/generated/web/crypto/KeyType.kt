// Automatically generated - do not modify!

package web.crypto

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type)
 */
@JsUnion
sealed /* union */
external interface KeyType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type#private)
 */
inline val KeyType.Companion.private: KeyType
    get() = unsafeCast("private")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type#public)
 */
inline val KeyType.Companion.public: KeyType
    get() = unsafeCast("public")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type#secret)
 */
inline val KeyType.Companion.secret: KeyType
    get() = unsafeCast("secret")
