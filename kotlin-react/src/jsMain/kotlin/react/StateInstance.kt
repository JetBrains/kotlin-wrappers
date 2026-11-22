package react

import js.array.component1
import js.array.component2
import js.array.tupleOf
import react.raw.StateInstanceRaw
import kotlin.reflect.KProperty

value class StateInstance<T>(
    @PublishedApi
    internal val state: StateInstanceRaw<T>,
) {
    constructor(
        value: T,
        setter: StateSetter<T>,
    ) : this(tupleOf(value, setter))

    inline operator fun component1(): T =
        state.component1()

    inline operator fun component2(): StateSetter<T> =
        state.component2()

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        component1()

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        component2()(value = value)
    }
}
