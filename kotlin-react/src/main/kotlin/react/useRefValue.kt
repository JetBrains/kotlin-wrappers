@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import kotlin.reflect.KProperty

inline fun <T : Any> useRefValue(): RefValueInstance<T?> =
    useRef<T>()
        .unsafeCast<RefValueInstance<T?>>()

inline fun <T : Any> useRefValue(
    initialValue: T,
): RefValueInstance<T> =
    useRef(initialValue)
        .unsafeCast<RefValueInstance<T>>()

// TODO: make external in IR
class RefValueInstance<T>
private constructor() {
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
