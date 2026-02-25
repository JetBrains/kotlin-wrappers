package react

import js.core.Void
import js.function.unsafeAsync
import js.promise.Promise
import js.promise.await
import js.reflect.unsafeCast

sealed external interface Action<in T> :
    ActionOrString<T>

suspend operator fun <T> Action<T>.invoke(data: T) {
    unsafeCast<ActionOriginal<T>>(this)(data)?.await()
}

private external interface ActionOriginal<in T> {
    operator fun invoke(data: T): Promise<Void>?
}

inline fun Action(
    value: String,
): ActionOrString<*> =
    unsafeCast(value)

fun <T> Action(
    value: suspend (T) -> Unit,
): Action<T> {
    val action = unsafeAsync<T, Void> { data ->
        value(data)
        undefined
    }

    return unsafeCast(action)
}
