@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react

import kotlin.reflect.KProperty

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
sealed external interface StateInstance<T> {
    inline operator fun component1(): T =
        asDynamic()[0].unsafeCast<T>()

    inline operator fun component2(): StateSetter<T> =
        asDynamic()[1].unsafeCast<StateSetter<T>>()

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        asDynamic()[0].unsafeCast<T>()

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        asDynamic()[1].unsafeCast<StateSetter<T>>()(value)
    }
}

inline fun <T> StateInstance(
    value: T,
    setter: StateSetter<T>,
): StateInstance<T> =
    arrayOf(value, setter)
        .unsafeCast<StateInstance<T>>()
