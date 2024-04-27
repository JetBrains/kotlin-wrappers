@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react.select

import js.array.ReadonlyArray

sealed external interface Value<T : Any>

inline fun <T : Any> Value(
    vararg value: T?,
): Value<T> =
    value.unsafeCast<Value<T>>()

fun <T : Any> Value<T>?.asArray(): ReadonlyArray<T> {
    val value: Any = this
        ?: return emptyArray()

    require(value is Array<*>) {
        "Multivalue required, but `$value` found instead"
    }

    return value.unsafeCast<ReadonlyArray<T>>()
}

fun <T : Any> Value<T>.single(): T {
    require(this !is Array<*>) {
        "Single value required, but array found instead"
    }

    return unsafeCast<T>()
}
