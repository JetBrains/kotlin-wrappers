@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package react.select

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import js.reflect.unsafeSpecialCast

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

fun <T : Any> Value<T>?.isNotEmpty(): Boolean {
    val value: ReadonlyArray<Any?> = unsafeSpecialCast(this)

    return value.size == 1 && value.single() != null
}
