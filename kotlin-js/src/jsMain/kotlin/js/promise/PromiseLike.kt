package js.promise

sealed external interface PromiseLike<out T> :
    PromiseResult<T> {
    fun <R> then(
        onFulfilled: ((T) -> R)?,
    ): PromiseLike<R>

    fun <R> then(
        onFulfilled: ((T) -> PromiseResult<R>)?,
    ): PromiseLike<R>

    fun <R> then(
        onFulfilled: ((T) -> R)?,
        onRejected: ((Throwable) -> R)?,
    ): PromiseLike<R>
}
