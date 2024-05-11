@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.promise

import js.errors.JsError
import js.promise.internal.awaitPromiseLike

sealed external interface PromiseLike<out T> :
    PromiseResult<T> {
    fun <R> then(
        onFulfilled: (T) -> R,
    ): PromiseLike<R>

    fun <R> then(
        onFulfilled: (T) -> R,
        onRejected: (JsError) -> R,
    ): PromiseLike<R>

    @JsName("then")
    fun <R> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): PromiseLike<R>

    @JsName("then")
    fun <R> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsError) -> PromiseResult<R>,
    ): PromiseLike<R>

    override suspend inline fun await(): T =
        awaitPromiseLike(this)
}
