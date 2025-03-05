package js.coroutines

import js.promise.Promise
import js.promise.deferred
import kotlinx.coroutines.Deferred

/**
 * Converts this deferred value to the instance of [Promise].
 *
 * [Original](https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/js/src/Promise.kt)
 */
fun <T> Deferred<T>.asPromise(): Promise<T> {
    val promise = Promise<T> { resolve, reject ->
        invokeOnCompletion {
            val exception = getCompletionExceptionOrNull()
            if (exception != null) {
                reject(exception)
            } else {
                resolve(getCompleted())
            }
        }
    }
    promise.deferred = this
    return promise
}
