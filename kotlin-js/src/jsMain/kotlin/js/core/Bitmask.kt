@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.core

import js.reflect.unsafeCast

@JsExternalInheritorsOnly
external interface Bitmask<T : Bitmask<T>> {
    inline val value: Int
        get() = unsafeCast(this)

    inline operator fun plus(other: T): T =
        unsafeCast(value or other.value)

    inline operator fun contains(other: T): Boolean =
        (value and other.value) == other.value
}
