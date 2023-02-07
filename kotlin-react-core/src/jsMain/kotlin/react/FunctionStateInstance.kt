@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlin.reflect.KProperty

// TODO: make external in IR
class FunctionStateInstance<T>
private constructor() {
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
        asDynamic()[1]({ value })
    }
}
