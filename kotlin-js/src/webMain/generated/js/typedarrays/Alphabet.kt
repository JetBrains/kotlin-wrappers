// Automatically generated - do not modify!

package js.typedarrays

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Alphabet

inline val Alphabet.Companion.base64: Alphabet
    get() = unsafeCast("base64")

inline val Alphabet.Companion.base64url: Alphabet
    get() = unsafeCast("base64url")
