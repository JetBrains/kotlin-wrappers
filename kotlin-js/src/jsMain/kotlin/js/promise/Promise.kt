package js.promise

import js.core.ReadonlyArray

open external class Promise<out T>(
    executor: (resolve: (T) -> Unit, reject: (Throwable) -> Unit) -> Unit,
) {
    open fun <S> then(onFulfilled: ((T) -> S)?): Promise<S>

    open fun <S> then(onFulfilled: ((T) -> S)?, onRejected: ((Throwable) -> S)?): Promise<S>

    open fun <S> catch(onRejected: (Throwable) -> S): Promise<S>

    open fun finally(onFinally: () -> Unit): Promise<T>

    companion object {
        fun <S> all(promise: ReadonlyArray<Promise<S>>): Promise<ReadonlyArray<S>>

        fun <S> race(promise: ReadonlyArray<Promise<S>>): Promise<S>

        fun reject(e: Throwable): Promise<Nothing>

        fun <S> resolve(e: S): Promise<S>
        fun <S> resolve(e: Promise<S>): Promise<S>
    }
}
