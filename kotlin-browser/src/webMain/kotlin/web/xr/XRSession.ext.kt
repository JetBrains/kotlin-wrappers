package web.xr

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

suspend fun XRSession.awaitAnimationFrame(): XRFrame =
    suspendCancellableCoroutine { continuation ->
        val requestId = requestAnimationFrame { _, frame ->
            continuation.resume(frame)
        }

        continuation.invokeOnCancellation {
            cancelAnimationFrame(requestId)
        }
    }
