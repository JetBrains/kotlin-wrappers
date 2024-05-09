// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder)
 */
external class VideoDecoder(
    init: VideoDecoderInit,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decodeQueueSize)
     */
    val decodeQueueSize: Int
    var ondequeue: EventHandler<Event, VideoDecoder>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/state)
     */
    val state: CodecState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure)
     */
    fun configure(config: VideoDecoderConfig)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decode)
     */
    fun decode(chunk: EncodedVideoChunk)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/flush)
     */
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/reset)
     */
    fun reset()

    companion object {
        suspend fun isConfigSupported(config: VideoDecoderConfig): VideoDecoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: VideoDecoderConfig): Promise<VideoDecoderSupport>
    }
}
