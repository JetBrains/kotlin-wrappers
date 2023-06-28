@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.promise

import js.core.ReadonlyArray
import js.core.Void
import js.errors.JsError
import kotlin.internal.LowPriorityInOverloadResolution

open external class Promise<out T>(
    executor: (resolve: PromiseResolve<T>) -> Unit,
) : PromiseLike<T> {

    constructor(
        executor: (
            resolve: PromiseResolve<T>,
            reject: (JsError) -> Unit,
        ) -> Unit,
    )

    override fun <R> then(
        onFulfilled: ((T) -> R)?,
    ): Promise<R>

    @LowPriorityInOverloadResolution
    override fun <R> then(
        onFulfilled: ((T) -> PromiseResult<R>)?,
    ): Promise<R>

    override fun <R> then(
        onFulfilled: ((T) -> R)?,
        onRejected: ((JsError) -> R)?,
    ): Promise<R>

    open fun <R> catch(
        onRejected: (JsError) -> R,
    ): Promise<R>

    open fun finally(
        onFinally: () -> Unit,
    ): Promise<T>

    companion object {
        fun <T> all(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<T>>

        fun <T> allSettled(values: ReadonlyArray<PromiseResult<T>>): Promise<ReadonlyArray<PromiseSettledResult<T>>>

        fun <T> any(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun <T> race(values: ReadonlyArray<PromiseResult<T>>): Promise<T>

        fun reject(reason: JsError): Promise<Void>

        fun resolve(): Promise<Void>
        fun <T> resolve(value: T): Promise<T>
        fun <T> resolve(value: PromiseResult<T>): Promise<T>
    }
}
