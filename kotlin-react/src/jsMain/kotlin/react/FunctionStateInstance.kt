package react

import js.array.Tuple2
import js.array.component1
import js.array.component2
import kotlin.reflect.KProperty

value class FunctionStateInstance<T>
private constructor(
    @PublishedApi
    internal val state: Tuple2<T, StateSetter<T>>,
) {
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
        state.component2()(transform = { value })
    }
}
