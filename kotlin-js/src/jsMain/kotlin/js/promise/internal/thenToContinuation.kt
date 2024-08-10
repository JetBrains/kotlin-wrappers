package js.promise.internal

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
        onFulfilled = continuation::resume,
        onRejected = continuation::resumeWithException,
    )
}
