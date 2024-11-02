@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.core.Void
import js.promise.Promise
import react.internal.isolatedPromise

private typealias ActionFunction<T> = (T) -> Promise<Void>?

private inline fun <T> toAction(
    noinline value: ActionFunction<T>,
): Action<T> =
    value.unsafeCast<Action<T>>()

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
    value.unsafeCast<ActionOrString<*>>()

fun <T> Action(
    value: suspend (T) -> Unit,
): Action<T> =
    toAction { data ->
        isolatedPromise {
            value(data)
            undefined
        }
    }
