@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.core.Void
import js.promise.Promise
import js.reflect.unsafeCast
import react.internal.isolatedPromise

private typealias ActionFunction<T> = (T) -> Promise<Void>?

private inline fun <T> toAction(
    noinline value: ActionFunction<T>,
): Action<T> =
    unsafeCast(value)

sealed external interface Action<in T> :
    ActionOrString<T>

suspend operator fun <T> Action<T>.invoke(
    data: T,
) {
    unsafeCast<ActionFunction<T>>()(data)?.await()
}

inline fun Action(
    value: String,
): ActionOrString<*> =
    unsafeCast(value)

fun <T> Action(
    value: suspend (T) -> Unit,
): Action<T> =
    toAction { data ->
        isolatedPromise {
            value(data)
            undefined
        }
    }
