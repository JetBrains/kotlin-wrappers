// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.typedarrays

import js.reflect.unsafeCast

@JsName("NaN")
sealed /* union */
external interface Alphabet {
    companion object
}

inline val Alphabet.Companion.base64: Alphabet
    get() = unsafeCast("base64")

inline val Alphabet.Companion.base64url: Alphabet
    get() = unsafeCast("base64url")
