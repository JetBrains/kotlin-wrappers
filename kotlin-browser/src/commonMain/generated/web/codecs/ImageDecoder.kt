// Automatically generated - do not modify!

package web.codecs

import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.core.Void
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`ImageDecoder`** interface of the WebCodecs API provides a way to unpack and decode encoded image data.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder)
 */
open external class ImageDecoder(
    init: ImageDecoderInit,
) {
    /**
     * The **`complete`** read-only property of the ImageDecoder interface returns true if encoded data has completed buffering.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/complete)
     */
    val complete: Boolean

    /**
     * The **`completed`** read-only property of the ImageDecoder interface returns a promise that resolves once encoded data has finished buffering.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/completed)
     */
    val completed: Promise<Void>

    /**
     * The **`tracks`** read-only property of the ImageDecoder interface returns a list of the tracks in the encoded image data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/tracks)
     */
    val tracks: ImageTrackList

    /**
     * The **`type`** read-only property of the ImageDecoder interface reflects the MIME type configured during construction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/type)
     */
    val type: String

    /**
     * The **`close()`** method of the ImageDecoder interface ends all pending work and releases system resources.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/close)
     */
    fun close()

    /**
     * The **`decode()`** method of the ImageDecoder interface enqueues a control message to decode the frame of an image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/decode)
     */
    @JsName("decode")
    fun decodeAsync(options: ImageDecodeOptions = definedExternally): Promise<ImageDecodeResult>

    /**
     * The **`reset()`** method of the ImageDecoder interface aborts all pending `decode()` operations; rejecting all pending promises.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/reset)
     */
    fun reset()

    companion object {
        /**
         * The **`ImageDecoder.isTypeSupported()`** static method checks if a given MIME type can be decoded by the user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/isTypeSupported_static)
         */
        @JsName("isTypeSupported")
        fun isTypeSupportedAsync(type: String): Promise<JsBoolean>
    }
}

/**
 * The **`decode()`** method of the ImageDecoder interface enqueues a control message to decode the frame of an image.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/decode)
 */
suspend inline fun ImageDecoder.decode(options: ImageDecodeOptions): ImageDecodeResult {
    return decodeAsync(options = options).await()
}

/**
 * The **`decode()`** method of the ImageDecoder interface enqueues a control message to decode the frame of an image.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/decode)
 */
suspend inline fun ImageDecoder.decode(): ImageDecodeResult {
    return decodeAsync().await()
}

/**
 * The **`ImageDecoder.isTypeSupported()`** static method checks if a given MIME type can be decoded by the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/isTypeSupported_static)
 */
suspend inline fun ImageDecoder.Companion.isTypeSupported(type: String): Boolean {
    return isTypeSupportedAsync(type = type).await().toBoolean()
}
