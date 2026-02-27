@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package react

import kotlin.reflect.KProperty

sealed external interface RefValueInstance<T> {
    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T {
        return asDynamic().current
    }

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        asDynamic().current = value
    }
}
