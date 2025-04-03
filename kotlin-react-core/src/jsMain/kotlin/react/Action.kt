package react

import js.core.Void
import js.promise.Promise
import js.reflect.unsafeCast
import js.reflect.legacyUnsafeCast
import react.internal.isolatedPromise
import seskar.js.JsAsync
import seskar.js.JsNativeInvoke

sealed external interface Action<in T> :
    ActionOrString<T> {
    @JsAsync
    suspend operator fun invoke(data: T)

    @JsNativeInvoke
    fun invokeAsync(data: T): Promise<Void>?
}

inline fun Action(
    value: String,
): ActionOrString<*> =
    unsafeCast(value)

fun <T> Action(
    value: suspend (T) -> Unit,
): Action<T> =
    legacyUnsafeCast { data: T ->
        isolatedPromise {
            value(data)
            undefined
        }
    }
