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
}
