@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import kotlin.reflect.KProperty

inline fun <T : Any> useRefValue(): RefDelegate<T?> =
    useRef<T>()
        .unsafeCast<RefDelegate<T?>>()

inline fun <T : Any> useRefValue(
    initialValue: T,
): RefDelegate<T> =
    useRef(initialValue)
        .unsafeCast<RefDelegate<T>>()

// TODO: make external in IR
class RefDelegate<T>
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
