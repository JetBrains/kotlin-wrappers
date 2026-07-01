package js.numbers

import js.numbers.internal.unsafeBitwiseAnd
import js.numbers.internal.unsafeBitwiseOr
import js.reflect.JsExternalInheritorsOnly

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Glossary/Bitwise_flags)
 */
@JsExternalInheritorsOnly
external interface Bitmask<T : Bitmask<T>>

inline operator fun <T : Bitmask<T>> T.plus(other: T): T =
    unsafeBitwiseOr(this, other)

inline operator fun <T : Bitmask<T>> T.contains(other: T): Boolean =
    unsafeBitwiseAnd(this, other) == other
