package js.promise

import js.core.JsAny
import js.errors.JsErrorLike
import js.promise.internal.awaitPromiseLike
import js.promise.internal.thenToContinuation
import kotlin.coroutines.Continuation
import kotlin.js.JsName

external interface PromiseLike<out T : JsAny?> :
    PromiseResult<T> {
    fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
    ): PromiseLike<R>

    fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
        onRejected: (JsErrorLike?) -> R,
    ): PromiseLike<R>

    @JsName("then")
    fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): PromiseLike<R>

    @JsName("then")
    fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsErrorLike?) -> PromiseResult<R>,
    ): PromiseLike<R>
}

suspend inline fun <T : JsAny?> PromiseLike<T>.await(): T =
    awaitPromiseLike(this)

suspend inline fun <T : JsAny?> PromiseLike<T>?.await(): T? =
    this?.let { awaitPromiseLike(it) }

inline fun <T : JsAny?> PromiseLike<T>.thenTo(
    continuation: Continuation<T>,
) {
    thenToContinuation(this, continuation)
}
