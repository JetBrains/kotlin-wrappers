// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`VideoEncoder`** interface of the WebCodecs API encodes VideoFrame objects into EncodedVideoChunks.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder)
 */
open external class VideoEncoder(
    init: VideoEncoderInit,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encodeQueueSize)
     */
    val encodeQueueSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/dequeue_event)
     */
    var ondequeue: EventHandler<Event, VideoEncoder, VideoEncoder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/state)
     */
    val state: CodecState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure)
     */
    fun configure(config: VideoEncoderConfig)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encode)
     */
    fun encode(
        frame: VideoFrame,
        options: VideoEncoderEncodeOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/flush)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/reset)
     */
    fun reset()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/dequeue_event)
     */
    @JsEvent("dequeue")
    val dequeueEvent: EventInstance<Event, VideoEncoder /* this */, VideoEncoder /* this */>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/isConfigSupported_static)
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun isConfigSupported(config: VideoEncoderConfig): VideoEncoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: VideoEncoderConfig): Promise<VideoEncoderSupport>
    }
}
