@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "WRONG_EXTERNAL_DECLARATION",

    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.promise

import js.core.JsAny
import js.errors.JsErrorLike
import js.promise.internal.awaitPromiseLike
import js.promise.internal.thenToContinuation
import kotlin.coroutines.Continuation
import kotlin.js.JsName

external interface PromiseLike<out T : JsAny?> :
    PromiseResult<T> {
    fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
    ): PromiseLike<R>

    fun <R : JsAny?> then(
        onFulfilled: (T) -> R,
        onRejected: (JsErrorLike?) -> R,
    ): PromiseLike<R>

    @JsName("then")
    fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
    ): PromiseLike<R>

    @JsName("then")
    fun <R : JsAny?> flatThen(
        onFulfilled: (T) -> PromiseResult<R>,
        onRejected: (JsErrorLike?) -> PromiseResult<R>,
    ): PromiseLike<R>

    override suspend inline fun await(): T =
        awaitPromiseLike(this)

    inline fun thenTo(
        continuation: Continuation<T>,
    ) {
        thenToContinuation(this, continuation)
    }
}
