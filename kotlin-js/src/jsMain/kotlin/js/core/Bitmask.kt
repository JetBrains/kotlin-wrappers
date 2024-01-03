@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.core

@JsExternalInheritorsOnly
external interface Bitmask<T : Bitmask<T>> {
    inline val value: Int
        get() = unsafeCast<Int>()

    inline operator fun plus(other: T): T =
        (value or other.value).unsafeCast<T>()

    inline operator fun contains(other: T): Boolean =
        (value and other.value) == other.value
}
