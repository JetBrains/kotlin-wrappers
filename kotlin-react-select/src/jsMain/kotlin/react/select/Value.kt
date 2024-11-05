@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react.select

import js.array.ReadonlyArray
import js.reflect.unsafeCast

sealed external interface Value<T : Any>

inline fun <T : Any> Value(
    vararg value: T?,
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
