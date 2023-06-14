@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.core

import kotlin.internal.LowPriorityInOverloadResolution

@JsName("Array")
sealed external class JsArray {
    companion object {
        fun <T> from(source: JsIterator<T>): ReadonlyArray<T>

        fun <T> from(source: JsIterable<T>): ReadonlyArray<T>

        @LowPriorityInOverloadResolution
        fun <T> from(source: ArrayLike<T>): ReadonlyArray<T>

        fun <T, U> from(
            source: ArrayLike<T>,
            map: (item: T, index: Int) -> U,
        ): ReadonlyArray<U>
    }
}
