@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.core.Void
import js.promise.Promise
import js.reflect.unsafeCast
import react.internal.isolatedPromise
import seskar.js.JsAsync

sealed external interface Action<in T> :
    ActionOrString<T> {
    @JsAsync
    operator fun invoke(data: T)

    // TODO: use `@JsNative` instead
    @nativeInvoke
    @Suppress("DEPRECATION")
    fun invokeAsync(data: T): Promise<Void>?
}

inline fun Action(
    value: String,
): ActionOrString<*> =
    unsafeCast(value)

fun <T> Action(
    value: suspend (T) -> Unit,
): Action<T> =
    unsafeCast { data: T ->
        isolatedPromise {
            value(data)
            undefined
        }
    }
