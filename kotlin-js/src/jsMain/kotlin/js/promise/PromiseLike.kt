package js.promise

sealed external interface PromiseLike<out T> :
    PromiseResult<T> {
    fun <S> then(
        onFulfilled: ((T) -> S)?,
    ): PromiseLike<S>

    fun <S> then(
        onFulfilled: ((T) -> S)?,
        onRejected: ((Throwable) -> S)?,
    ): PromiseLike<S>
}
