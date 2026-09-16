package web.coroutines

import js.promise.PromiseLike
import js.promise.thenTo
import js.resource.Resource
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.AbortSignal

suspend fun <T : JsAny?> awaitResource(
    block: (signal: AbortSignal) -> PromiseLike<T>,
): Resource<T> {
    val controller = AbortController()

    val value = suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            controller.abort()
        }

        block(controller.signal)
            .thenTo(continuation)
    }

    return object : Resource<T> {
        override val value: T = value
        override fun close() {
            controller.abort()
        }
    }
}
