package web.animations

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * Suspend adapter for [requestAnimationFrame]
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/requestAnimationFrame)
 */
suspend fun awaitAnimationFrame() {
    suspendCancellableCoroutine { continuation ->
        val requestId = requestAnimationFrame(continuation::resume)

        continuation.invokeOnCancellation {
            cancelAnimationFrame(requestId)
        }
    }
}
