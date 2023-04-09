@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react.select

import js.core.ReadonlyArray

sealed external interface Value<T : Any>

inline fun <T : Any> Value(
    vararg value: T?,
): Value<T> =
    value.unsafeCast<Value<T>>()

fun <T : Any> Value<T>?.toArray(): ReadonlyArray<T> =
    when (this) {
        null -> emptyArray()
        is Array<*> -> unsafeCast<ReadonlyArray<T>>()
        else -> arrayOf(this.unsafeCast<T>())
    }

fun <T : Any> Value<T>.single(): T {
    require(this !is Array<*>) {
        "Single value required, but array found instead"
    }

    return unsafeCast<T>()
}
