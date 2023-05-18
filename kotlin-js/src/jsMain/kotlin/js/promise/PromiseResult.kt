@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.promise

import kotlin.js.Promise

// T | PromiseLike<T>
sealed external interface PromiseResult<out T>

inline fun <T> PromiseResult(
    value: T,
): PromiseResult<T> =
    value.unsafeCast<PromiseResult<T>>()

inline fun <T> PromiseResult(
    value: Promise<T>,
): PromiseResult<T> =
    value.unsafeCast<PromiseResult<T>>()

inline fun <T> PromiseResult<T>.toPromise(): Promise<T> =
    Promise.resolve(unsafeCast<T>())
