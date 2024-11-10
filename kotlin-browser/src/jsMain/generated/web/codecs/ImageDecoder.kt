// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder)
 */
open external class ImageDecoder(
    init: ImageDecoderInit,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/complete)
     */
    val complete: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/completed)
     */
    val completed: Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/tracks)
     */
    val tracks: ImageTrackList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/type)
     */
    val type: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/decode)
     */
    @JsAsync
    suspend fun decode(options: ImageDecodeOptions = definedExternally): ImageDecodeResult

    @JsName("decode")
    fun decodeAsync(options: ImageDecodeOptions = definedExternally): Promise<ImageDecodeResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/reset)
     */
    fun reset()

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/isTypeSupported_static)
         */
        @JsAsync
        suspend fun isTypeSupported(type: String): Boolean

        @JsName("isTypeSupported")
        fun isTypeSupportedAsync(type: String): Promise<Boolean>
    }
}
