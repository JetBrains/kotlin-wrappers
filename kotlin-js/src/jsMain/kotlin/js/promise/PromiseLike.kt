package js.promise

import kotlin.js.Promise

sealed external interface PromiseLike<out T> :
    PromiseResult<T> {
    fun <S> then(
        onFulfilled: ((T) -> S)?,
    ): Promise<S>

    fun <S> then(
        onFulfilled: ((T) -> S)?,
        onRejected: ((Throwable) -> S)?,
    ): Promise<S>
}
