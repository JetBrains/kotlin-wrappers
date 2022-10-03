@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react.select

import kotlinx.js.ReadonlyArray

sealed external interface Value<T : Any>

inline fun <T : Any> Value(
    vararg value: T?,
): Value<T> = value.unsafeCast<Value<T>>()

inline fun <T : Any> Value<T>?.toArray(): ReadonlyArray<T> =
    when (this) {
        null -> emptyArray()
        is Array<*> -> unsafeCast<ReadonlyArray<T>>()
        else -> arrayOf(this.unsafeCast<T>())
    }

inline fun <T : Any> Value<T>?.only(): T? =
    when (this) {
        null -> null
        is Array<*> ->
            if (this.isNotEmpty()) {
                single().unsafeCast<T>()
            } else null

        else -> unsafeCast<T>()
    }
