package js.promise

import js.core.JsIterable
import js.core.ReadonlyArray
import js.core.Void
import js.errors.JsError

open external class Promise<out T>(
    executor: (resolve: PromiseResolve<T>) -> Unit,
) : PromiseLike<T> {

    constructor(
        executor: (
            resolve: PromiseResolve<T>,
            reject: (JsError) -> Unit,
        ) -> Unit,
    )

    final override fun <R> then(
        onFulfilled: (T) -> R,
    ): Promise<R>

    final override fun <R> then(
        onFulfilled: (T) -> R,
        onRejected: (JsError) -> R,
    ): Promise<R>

    final override fun <R> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): Promise<R>

    final override fun <R> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsError) -> PromiseResult<R>,
    ): Promise<R>

    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(
        onRejected: (JsError) -> @UnsafeVariance T,
    ): Promise<T>

    @PublishedApi
    @JsName("catch")
    internal fun flatCatchInternal(
        onRejected: (JsError) -> PromiseResult<@UnsafeVariance T>,
    ): Promise<T>

    fun finally(
        onFinally: () -> Unit,
    ): Promise<T>

    companion object {
        fun <T> all(values: JsIterable<PromiseResult<T>>): Promise<ReadonlyArray<T>>
        fun <T> all(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<T>>

        fun <T> allSettled(values: JsIterable<PromiseResult<T>>): Promise<ReadonlyArray<PromiseSettledResult<T>>>
        fun <T> allSettled(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<PromiseSettledResult<T>>>

        fun <T> any(values: JsIterable<PromiseResult<T>>): Promise<T>
        fun <T> any(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun <T> race(values: JsIterable<PromiseResult<T>>): Promise<T>
        fun <T> race(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun reject(reason: JsError): Promise<Nothing>

        fun resolve(): Promise<Void>
        fun <T> resolve(value: T): Promise<T>
        fun <T> resolve(value: PromiseResult<T>): Promise<T>
    }
}

inline fun <T> Promise<T>.catch(
    noinline onRejected: (JsError) -> T,
): Promise<T> =
    catchInternal(onRejected = onRejected)

inline fun <T> Promise<T>.flatCatch(
    noinline onRejected: (JsError) -> PromiseResult<T>,
): Promise<T> =
    flatCatchInternal(onRejected = onRejected)
