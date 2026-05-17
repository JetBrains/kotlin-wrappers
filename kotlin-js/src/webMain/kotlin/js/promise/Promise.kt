package js.promise

import js.array.ReadonlyArray
import js.core.Void
import js.errors.JsError
import js.errors.JsErrorLike
import js.iterable.JsIterable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise)
 */
open external class Promise<out T : JsAny?>(
    executor: (resolve: PromiseResolve<T>) -> Unit,
) : PromiseLike<T> {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/Promise)
     */
    constructor(
        executor: (
            resolve: PromiseResolve<T>,
            reject: PromiseReject,
        ) -> Unit,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    final override fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
    ): Promise<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    final override fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
        onRejected: (JsErrorLike?) -> R,
    ): Promise<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    final override fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): Promise<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/then)
     */
    final override fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsErrorLike?) -> PromiseResult<R>,
    ): Promise<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/catch)
     */
    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(
        onRejected: (JsErrorLike?) -> @UnsafeVariance T,
    ): Promise<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/catch)
     */
    @PublishedApi
    @JsName("catch")
    internal fun flatCatchInternal(
        onRejected: (JsErrorLike?) -> PromiseResult<@UnsafeVariance T>,
    ): Promise<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/finally)
     */
    fun finally(
        onFinally: () -> Unit,
    ): Promise<T>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/all)
         */
        fun <T : JsAny?> all(
            values: JsIterable<PromiseResult<T>>,
        ): Promise<ReadonlyArray<T>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/all)
         */
        fun <T : JsAny?> all(
            values: ReadonlyArray<PromiseResult<T>>,
        ): Promise<ReadonlyArray<T>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/allSettled)
         */
        fun <T : JsAny?> allSettled(
            values: JsIterable<PromiseResult<T>>,
        ): Promise<ReadonlyArray<PromiseSettledResult<T>>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/allSettled)
         */
        fun <T : JsAny?> allSettled(
            values: ReadonlyArray<PromiseResult<T>>,
        ): Promise<ReadonlyArray<PromiseSettledResult<T>>>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/any)
         */
        fun <T : JsAny?> any(
            values: JsIterable<PromiseResult<T>>,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/any)
         */
        fun <T : JsAny?> any(
            values: ReadonlyArray<PromiseResult<T>>,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/race)
         */
        fun <T : JsAny?> race(
            values: JsIterable<PromiseResult<T>>,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/race)
         */
        fun <T : JsAny?> race(
            values: ReadonlyArray<PromiseResult<T>>,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/reject)
         */
        fun reject(
            reason: JsError,
        ): Promise<Nothing>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/resolve)
         */
        fun resolve(): Promise<Void>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/resolve)
         */
        fun <T : JsAny?> resolve(
            value: T,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/resolve)
         */
        fun <T : JsAny?> resolve(
            value: PromiseResult<T>,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/try)
         */
        fun <T : JsAny?> `try`(
            block: () -> T,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/try)
         */
        @JsName("try")
        fun <T : JsAny?> flatTry(
            block: () -> PromiseResult<T>,
        ): Promise<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/withResolvers)
         */
        fun <T : JsAny?> withResolvers(): PromiseWithResolvers<T>
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/catch)
 */
inline fun <T : JsAny?> Promise<T>.catch(
    noinline onRejected: (JsErrorLike?) -> T,
): Promise<T> =
    catchInternal(onRejected = onRejected)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Promise/catch)
 */
inline fun <T : JsAny?> Promise<T>.flatCatch(
    noinline onRejected: (JsErrorLike?) -> PromiseResult<T>,
): Promise<T> =
    flatCatchInternal(onRejected = onRejected)
