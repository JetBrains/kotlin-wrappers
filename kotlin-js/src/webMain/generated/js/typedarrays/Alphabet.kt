// Automatically generated - do not modify!

package js.typedarrays

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#alphabet)
 */
@JsUnion
sealed /* union */
external interface Alphabet

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#:~:text=base64)
 */
inline val Alphabet.Companion.base64: Alphabet
    get() = unsafeCast("base64")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#:~:text=base64url)
 */
inline val Alphabet.Companion.base64url: Alphabet
    get() = unsafeCast("base64url")
