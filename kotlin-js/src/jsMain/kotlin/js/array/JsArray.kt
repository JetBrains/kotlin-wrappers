@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.array

import js.core.ReadonlyArray
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.iterable.JsIterator
import js.promise.Promise
import js.promise.PromiseResult
import kotlin.internal.LowPriorityInOverloadResolution

@JsName("Array")
sealed external class JsArray {
    companion object {
        fun <T> from(source: JsIterator<T>): ReadonlyArray<T>

        fun <T> from(source: JsIterable<T>): ReadonlyArray<T>

        @LowPriorityInOverloadResolution
        fun <T> from(source: ArrayLike<T>): ReadonlyArray<T>

        fun <T, U> from(
            source: JsIterator<T>,
            transform: (item: T, index: Int) -> U,
        ): ReadonlyArray<U>

        fun <T, U> from(
            source: JsIterable<T>,
            transform: (item: T, index: Int) -> U,
        ): ReadonlyArray<U>

        @LowPriorityInOverloadResolution
        fun <T, U> from(
            source: ArrayLike<T>,
            transform: (item: T, index: Int) -> U,
        ): ReadonlyArray<U>

        fun <T> fromAsync(source: AsyncIterable<T>): Promise<ReadonlyArray<T>>

        fun <T> fromAsync(source: JsIterable<PromiseResult<T>>): Promise<ReadonlyArray<T>>

        fun <T> fromAsync(source: ReadonlyArray<PromiseResult<T>> /* ArrayLike */): Promise<ReadonlyArray<T>>

        fun <T, U> fromAsync(
            source: AsyncIterable<T>,
            transform: (item: T, index: Int) -> U,
        ): Promise<ReadonlyArray<U>>

        fun <T, U> fromAsync(
            source: JsIterable<PromiseResult<T>>,
            transform: (item: T, index: Int) -> U,
        ): Promise<ReadonlyArray<U>>

        fun <T, U> fromAsync(
            source: ReadonlyArray<PromiseResult<T>>, /* ArrayLike */
            transform: (item: T, index: Int) -> U,
        ): Promise<ReadonlyArray<U>>
    }
}
