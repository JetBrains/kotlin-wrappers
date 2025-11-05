package web.html

import web.blob.Blob
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * The **`HTMLCanvasElement.toBlob()`** method creates a Blob object representing the image contained in the canvas. This file may be cached on the disk or stored in memory at the discretion of the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
 */
suspend fun HTMLCanvasElement.toBlob(): Blob? =
    suspendCoroutine { continuation ->
        toBlobWithCallback(
            callback = continuation::resume,
        )
    }

/**
 * The **`HTMLCanvasElement.toBlob()`** method creates a Blob object representing the image contained in the canvas. This file may be cached on the disk or stored in memory at the discretion of the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
 */
suspend fun HTMLCanvasElement.toBlob(
    type: String,
): Blob? =
    suspendCoroutine { continuation ->
        toBlobWithCallback(
            callback = continuation::resume,
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
): Blob? =
    suspendCoroutine { continuation ->
        toBlobWithCallback(
            callback = continuation::resume,
            type = type,
            quality = quality,
        )
    }
