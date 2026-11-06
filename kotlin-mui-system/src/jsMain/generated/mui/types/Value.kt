// Automatically generated - do not modify!

package mui.types

import js.array.ReadonlyArray
import js.reflect.unsafeCast

sealed /* union */
external interface Value<T : Any>

inline fun <T : Any> Value(
    value: T?,
): Value<T>? =
    unsafeCast(value)

inline fun <T : Any> Value(
    value: ReadonlyArray<T>,
): Value<T> =
    unsafeCast(value)

fun <T : Any> Value<T>?.asArray(): ReadonlyArray<T> {
    val value: Any = this
        ?: return emptyArray()

    require(value is Array<*>) {
        "Multivalue required, but `$value` found instead"
    }

    return unsafeCast(value)
}

fun <T : Any> Value<T>.single(): T {
    val value: Any = this

    require(value !is Array<*>) {
        "Single value required, but array found instead"
    }

    return unsafeCast(value)
}
