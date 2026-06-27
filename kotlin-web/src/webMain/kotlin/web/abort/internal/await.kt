package web.abort.internal

import js.promise.PromiseLike
import js.promise.thenTo
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.Abortable
import web.abort.unsafeAbortable

// Used in the compiler plugin
internal fun <T : Abortable> patchAbortOptions(
    options: T?,
    controller: AbortController,
): T =
    unsafeAbortable(options, controller.signal)

// Used in the compiler plugin
internal suspend fun <T : JsAny?> awaitPromiseLike(
    promise: PromiseLike<T>,
    controller: AbortController,
): T =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            controller.abort()
        }

        promise.thenTo(continuation)
    }
