package js.promise

import js.errors.JsErrorLike
import js.promise.internal.awaitPromiseLike
import js.promise.internal.thenToContinuation
import kotlin.coroutines.Continuation

external interface PromiseLike<out T : JsAny?> :
    PromiseResult<T> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
    ): PromiseLike<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
        onRejected: (JsErrorLike?) -> R,
    ): PromiseLike<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    @JsName("then")
    fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): PromiseLike<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    @JsName("then")
    fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsErrorLike?) -> PromiseResult<R>,
    ): PromiseLike<R>
}

suspend inline fun <T : JsAny?> PromiseLike<T>.await(): T =
    awaitPromiseLike(this)

inline fun <T : JsAny?> PromiseLike<T>.thenTo(
    continuation: Continuation<T>,
) {
    thenToContinuation(this, continuation)
}
