package js.promise.internal

import js.coroutines.resumeWithError
import js.promise.PromiseLike
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume

@PublishedApi
internal fun <T : JsAny?> thenToContinuation(
    promise: PromiseLike<T>,
    continuation: Continuation<T>,
) {
    promise.then(
        onFulfilled = { continuation.resume(it); null },
        onRejected = { continuation.resumeWithError(it); null },
    )
}
