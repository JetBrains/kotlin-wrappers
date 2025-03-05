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
import js.promise.internal.awaitPromiseResult

// T | PromiseLike<T>
sealed external interface PromiseResult<out T> :
    JsAny {

    suspend inline fun await(): T =
        awaitPromiseResult(this)
}

inline fun <T> PromiseResult<T>.toPromise(): Promise<T> =
    Promise.resolve(this)
