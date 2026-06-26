package web.coroutines

import js.promise.PromiseLike
import js.promise.thenTo
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.AbortSignal

suspend fun <T : JsAny?> await(
    block: (signal: AbortSignal) -> PromiseLike<T>,
): T =
    suspendCancellableCoroutine { continuation ->
        val controller = AbortController()

        continuation.invokeOnCancellation {
            controller.abort()
        }

        block(controller.signal)
            .thenTo(continuation)
    }
