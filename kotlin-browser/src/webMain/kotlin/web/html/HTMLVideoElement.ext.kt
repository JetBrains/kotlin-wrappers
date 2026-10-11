// Automatically generated - do not modify!

package web.html

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * Suspend adapter for [requestVideoFrameCallback]
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/requestVideoFrameCallback)
 */
suspend fun HTMLVideoElement.awaitVideoFrame(): VideoFrameCallbackMetadata =
    suspendCancellableCoroutine { continuation ->
        val requestId = requestVideoFrameCallback { _, metadata ->
            continuation.resume(metadata)
        }

        continuation.invokeOnCancellation {
            cancelVideoFrameCallback(requestId)
        }
    }
