package web.html

import js.coroutines.resumeWithError
import web.blob.Blob
import web.errors.DOMException
import web.errors.OperationError
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

private fun BlobCallback(
    continuation: Continuation<Blob>,
): BlobCallback = { blob ->
    if (blob != null) {
        continuation.resume(blob)
    } else {
        val error = DOMException(
            message = "Unable to create blob from canvas",
            name = DOMException.OperationError,
        )

        continuation.resumeWithError(error)
    }
}

/**
 * The **`HTMLCanvasElement.toBlob()`** method creates a Blob object representing the image contained in the canvas. This file may be cached on the disk or stored in memory at the discretion of the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
 */
suspend fun HTMLCanvasElement.toBlob(): Blob =
    suspendCoroutine { continuation ->
        toBlobWithCallback(
            callback = BlobCallback(continuation),
        )
    }

/**
 * The **`HTMLCanvasElement.toBlob()`** method creates a Blob object representing the image contained in the canvas. This file may be cached on the disk or stored in memory at the discretion of the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
 */
suspend fun HTMLCanvasElement.toBlob(
    type: String,
): Blob =
    suspendCoroutine { continuation ->
        toBlobWithCallback(
            callback = BlobCallback(continuation),
            type = type,
        )
    }

/**
 * The **`HTMLCanvasElement.toBlob()`** method creates a Blob object representing the image contained in the canvas. This file may be cached on the disk or stored in memory at the discretion of the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
 */
suspend fun HTMLCanvasElement.toBlob(
    type: String,
    quality: Double,
): Blob =
    suspendCoroutine { continuation ->
        toBlobWithCallback(
            callback = BlobCallback(continuation),
            type = type,
            quality = quality,
        )
    }
