@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import kotlin.reflect.KProperty

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
// TODO: make external in IR
sealed class StateInstance<T> {
    inline val value: T
        get() = asDynamic()[0].unsafeCast<T>()

    inline val setter: StateSetter<T>
        get() = asDynamic()[0].unsafeCast<StateSetter<T>>()

    inline operator fun component1(): T =
        value

    inline operator fun component2(): StateSetter<T> =
        setter

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        value

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        setter(value)
    }
}
