package js.promise.internal

import js.core.JsAny
import js.errors.toThrowable
import js.promise.PromiseLike
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

@PublishedApi
internal fun <T : JsAny?> thenToContinuation(
    promise: PromiseLike<T>,
    continuation: Continuation<T>,
) {
    promise.then(
        onFulfilled = { continuation.resume(it); null },
        onRejected = { continuation.resumeWithException(it.toThrowable()); null },
    )
}
