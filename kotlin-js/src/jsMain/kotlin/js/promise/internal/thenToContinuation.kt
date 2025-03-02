package js.promise.internal

import js.errors.toThrowable
import js.promise.PromiseLike
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

@PublishedApi
internal fun <T> thenToContinuation(
    promise: PromiseLike<T>,
    continuation: Continuation<T>,
) {
    promise.then(
        onFulfilled = { continuation.resume(it) },
        onRejected = { continuation.resumeWithException(it.toThrowable()) },
    )
}
