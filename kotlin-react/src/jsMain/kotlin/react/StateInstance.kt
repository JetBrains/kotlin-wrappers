@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package react

import js.reflect.unsafeCast
import kotlin.reflect.KProperty

sealed external interface StateInstance<T> {
    inline operator fun component1(): T =
        asDynamic()[0]

    inline operator fun component2(): StateSetter<T> =
        asDynamic()[1]

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        asDynamic()[0]

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        asDynamic()[1](value)
    }
}

inline fun <T> StateInstance(
    value: T,
    setter: StateSetter<T>,
): StateInstance<T> =
    unsafeCast(arrayOf(value, setter))
