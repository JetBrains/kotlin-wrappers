package web.animations

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

suspend fun awaitAnimationFrame() {
    suspendCancellableCoroutine { continuation ->
        val requestId = requestAnimationFrame(continuation::resume)

        continuation.invokeOnCancellation {
            cancelAnimationFrame(requestId)
        }
    }
}
