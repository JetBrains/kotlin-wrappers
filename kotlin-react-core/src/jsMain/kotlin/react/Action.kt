@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.promise.Promise

sealed external interface Action<in T> :
    ActionOrString<T>

suspend operator fun <T> Action<T>.invoke(
    data: T,
) {
    val result: Any? = asDynamic()(data)
    Promise.resolve(result).await()
}

inline fun Action(
    value: String,
): ActionOrString<*> =
    value.unsafeCast<ActionOrString<*>>()

inline fun Action(
    noinline value: () -> Unit,
): Action<*> =
    value.unsafeCast<Action<*>>()

inline fun <T> Action(
    noinline value: (T) -> Unit,
): Action<T> =
    value.unsafeCast<Action<T>>()
