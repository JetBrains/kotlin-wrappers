@file:Suppress(
    "INVISIBLE_REFERENCE",
)

package js.array

import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.iterable.JsIterator
import js.promise.Promise
import js.promise.PromiseResult
import kotlin.internal.LowPriorityInOverloadResolution
import kotlin.js.JsAny
import kotlin.js.JsName

@JsName("Array")
external object JsArrays {
    fun <T : JsAny?> from(source: JsIterator<T>): ReadonlyArray<T>

    fun <T : JsAny?> from(source: JsIterable<T>): ReadonlyArray<T>

    @LowPriorityInOverloadResolution
    fun <T : JsAny?> from(source: ArrayLike<T>): ReadonlyArray<T>

    fun <T : JsAny?, U : JsAny?> from(
        source: JsIterator<T>,
        transform: (item: T, index: Int) -> U,
    ): ReadonlyArray<U>

    fun <T : JsAny?, U : JsAny?> from(
        source: JsIterable<T>,
        transform: (item: T, index: Int) -> U,
    ): ReadonlyArray<U>

    @LowPriorityInOverloadResolution
    fun <T : JsAny?, U : JsAny?> from(
        source: ArrayLike<T>,
        transform: (item: T, index: Int) -> U,
    ): ReadonlyArray<U>

    fun <T : JsAny?> fromAsync(source: AsyncIterable<T>): Promise<ReadonlyArray<T>>

    fun <T : JsAny?> fromAsync(source: JsIterable<PromiseResult<T>>): Promise<ReadonlyArray<T>>

    fun <T : JsAny?> fromAsync(source: ReadonlyArray<PromiseResult<T>> /* ArrayLike */): Promise<ReadonlyArray<T>>

    fun <T : JsAny?, U : JsAny?> fromAsync(
        source: AsyncIterable<T>,
        transform: (item: T, index: Int) -> U,
    ): Promise<ReadonlyArray<U>>

    fun <T : JsAny?, U : JsAny?> fromAsync(
        source: JsIterable<PromiseResult<T>>,
        transform: (item: T, index: Int) -> U,
    ): Promise<ReadonlyArray<U>>

    fun <T : JsAny?, U : JsAny?> fromAsync(
        source: ReadonlyArray<PromiseResult<T>>, /* ArrayLike */
        transform: (item: T, index: Int) -> U,
    ): Promise<ReadonlyArray<U>>
}
