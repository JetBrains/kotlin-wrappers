package react

import kotlin.reflect.KProperty

/**
 * [RefObject] effectively
 */
private external interface RefValue<T> {
    var current: T
}

value class RefValueInstance<T>
private constructor(
    private val ref: RefValue<T>,
) {
    operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T {
        return ref.current
    }

    operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        ref.current = value
    }
}
