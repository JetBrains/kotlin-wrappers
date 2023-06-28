package js.promise

import js.core.ReadonlyArray

open external class Promise<out T>(
    executor: (resolve: (T) -> Unit, reject: (Throwable) -> Unit) -> Unit,
) : PromiseLike<T> {
    override fun <R> then(
        onFulfilled: ((T) -> R)?,
    ): Promise<R>

    override fun <R> then(
        onFulfilled: ((T) -> R)?,
        onRejected: ((Throwable) -> R)?,
    ): Promise<R>

    open fun <R> catch(
        onRejected: (Throwable) -> R,
    ): Promise<R>

    open fun finally(
        onFinally: () -> Unit,
    ): Promise<T>

    companion object {
        fun <T> all(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<T>>

        fun <T> race(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun reject(reason: Throwable): Promise<Nothing>

        fun <T> resolve(value: T): Promise<T>
        fun <T> resolve(value: Promise<T>): Promise<T>
    }
}
