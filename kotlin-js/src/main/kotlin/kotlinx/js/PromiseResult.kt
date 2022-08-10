@file:Suppress(
    "NOTHING_TO_INLINE",
)

package kotlinx.js

import kotlin.js.Promise

// T | Promise<T>
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
