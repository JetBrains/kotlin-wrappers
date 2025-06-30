package js.core

import js.math.unsafeBitwiseAnd
import js.math.unsafeBitwiseOr
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface Bitmask<T : Bitmask<T>>

inline operator fun <T : Bitmask<T>> T.plus(other: T): T =
    unsafeBitwiseOr(this, other)

inline operator fun <T : Bitmask<T>> T.contains(other: T): Boolean =
    unsafeBitwiseAnd(this, other) == other



