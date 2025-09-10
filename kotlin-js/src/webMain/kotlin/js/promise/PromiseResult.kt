package js.promise

import js.promise.internal.awaitPromiseResult
import kotlin.js.JsAny

// T | PromiseLike<T>
sealed external interface PromiseResult<out T : JsAny?>

suspend inline fun <T : JsAny?> PromiseResult<T>.await(): T =
    awaitPromiseResult(this)

inline fun <T : JsAny?> PromiseResult<T>.toPromise(): Promise<T> =
    Promise.resolve(this)
