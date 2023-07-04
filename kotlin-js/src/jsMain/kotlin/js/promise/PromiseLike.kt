package js.promise

import js.errors.JsError

sealed external interface PromiseLike<out T> :
    PromiseResult<T> {
    fun <R> then(
        onFulfilled: (T) -> R,
    ): PromiseLike<R>

    fun <R> then(
        onFulfilled: (T) -> R,
        onRejected: (JsError) -> R,
    ): PromiseLike<R>

    @JsName("then")
    fun <R> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): PromiseLike<R>

    @JsName("then")
    fun <R> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsError) -> PromiseResult<R>,
    ): PromiseLike<R>
}
