@file:Suppress(
    "WRONG_EXTERNAL_DECLARATION",

    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package js.promise

import js.core.JsAny
import js.core.JsAnyMarker
import js.promise.internal.awaitPromiseResult

// T | PromiseLike<T>
sealed external interface PromiseResult<out T : JsAny?> :
    JsAnyMarker {

    suspend inline fun await(): T =
        awaitPromiseResult(this)
}

inline fun <T : JsAny?> PromiseResult<T>.toPromise(): Promise<T> =
    Promise.resolve(this)
