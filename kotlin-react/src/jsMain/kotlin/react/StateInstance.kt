package react

import js.array.Tuple2
import js.array.component1
import js.array.component2
import js.reflect.unsafeCast
import kotlin.reflect.KProperty

value class StateInstance<T>
internal constructor(
    @PublishedApi
    internal val state: Tuple2<T, StateSetter<T>>,
) {
    inline operator fun component1(): T =
        state.component1()

    inline operator fun component2(): StateSetter<T> =
        state.component2()

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        state.component1()

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        state.component2()(value)
    }
}

inline fun <T> StateInstance(
    value: T,
    setter: StateSetter<T>,
): StateInstance<T> =
    unsafeCast(arrayOf(value, setter))
