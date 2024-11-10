@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.promise

import js.promise.internal.awaitPromiseResult
import js.reflect.unsafeCast

// T | PromiseLike<T>
sealed external interface PromiseResult<out T> {
    suspend inline fun await(): T =
        awaitPromiseResult(this)
}

inline fun <T> PromiseResult(
    value: T,
): PromiseResult<T> =
    unsafeCast(value)

inline fun <T> PromiseResult<T>.toPromise(): Promise<T> =
    Promise.resolve(this)
