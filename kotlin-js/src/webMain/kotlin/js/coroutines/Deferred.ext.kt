package js.coroutines

import js.errors.toJsErrorLike
import js.promise.Promise
import js.promise.deferred
import js.promise.invoke
import kotlinx.coroutines.Deferred
import kotlin.js.JsAny

/**
 * Converts this deferred value to the instance of [Promise].
 *
 * [Original](https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/js/src/Promise.kt)
 */
fun <T : JsAny?> Deferred<T>.asPromise(): Promise<T> {
    val promise = Promise<T> { resolve, reject ->
        invokeOnCompletion {
            val exception = getCompletionExceptionOrNull()
            if (exception != null) {
                reject(exception.toJsErrorLike())
            } else {
                resolve(getCompleted())
            }
        }
    }
    promise.deferred = this
    return promise
}
