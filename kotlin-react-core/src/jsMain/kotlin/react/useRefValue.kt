@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import kotlin.reflect.KProperty

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T : Any> useRefValue(): RefValueInstance<T?> =
    useRef<T>()
        .unsafeCast<RefValueInstance<T?>>()

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
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
