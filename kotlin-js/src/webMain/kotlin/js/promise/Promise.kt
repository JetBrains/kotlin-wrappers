package js.promise

import js.array.ReadonlyArray
import js.core.Void
import js.errors.JsError
import js.errors.JsErrorLike
import js.iterable.JsIterable
import kotlin.js.JsAny
import kotlin.js.JsName

open external class Promise<out T : JsAny?>(
    executor: (resolve: PromiseResolve<T>) -> Unit,
) : PromiseLike<T> {

    constructor(
        executor: (
            resolve: PromiseResolve<T>,
            reject: PromiseReject,
        ) -> Unit,
    )

    final override fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
    ): Promise<R>

    final override fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
        onRejected: (JsErrorLike?) -> R,
    ): Promise<R>

    final override fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): Promise<R>

    final override fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsErrorLike?) -> PromiseResult<R>,
    ): Promise<R>

    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(
        onRejected: (JsErrorLike?) -> @UnsafeVariance T,
    ): Promise<T>

    @PublishedApi
    @JsName("catch")
    internal fun flatCatchInternal(
        onRejected: (JsErrorLike?) -> PromiseResult<@UnsafeVariance T>,
    ): Promise<T>

    fun finally(
        onFinally: () -> Unit,
    ): Promise<T>

    companion object {
        fun <T : JsAny?> all(values: JsIterable<PromiseResult<T>>): Promise<ReadonlyArray<T>>
        fun <T : JsAny?> all(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<T>>

        fun <T : JsAny?> allSettled(values: JsIterable<PromiseResult<T>>): Promise<ReadonlyArray<PromiseSettledResult<T>>>
        fun <T : JsAny?> allSettled(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<PromiseSettledResult<T>>>

        fun <T : JsAny?> any(values: JsIterable<PromiseResult<T>>): Promise<T>
        fun <T : JsAny?> any(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun <T : JsAny?> race(values: JsIterable<PromiseResult<T>>): Promise<T>
        fun <T : JsAny?> race(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun reject(reason: JsError): Promise<Nothing>

        fun resolve(): Promise<Void>
        fun <T : JsAny?> resolve(value: T): Promise<T>
        fun <T : JsAny?> resolve(value: PromiseResult<T>): Promise<T>

        fun <T : JsAny?> `try`(block: () -> T): Promise<T>

        @JsName("try")
        fun <T : JsAny?> flatTry(block: () -> PromiseResult<T>): Promise<T>

        fun <T : JsAny?> withResolvers(): PromiseWithResolvers<T>
    }
}

inline fun <T : JsAny?> Promise<T>.catch(
    noinline onRejected: (JsErrorLike?) -> T,
): Promise<T> =
    catchInternal(onRejected = onRejected)

inline fun <T : JsAny?> Promise<T>.flatCatch(
    noinline onRejected: (JsErrorLike?) -> PromiseResult<T>,
): Promise<T> =
    flatCatchInternal(onRejected = onRejected)
