// Automatically generated - do not modify!

package web.codecs

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder)
 */
external class VideoEncoder(
    init: VideoEncoderInit,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encodeQueueSize)
     */
    val encodeQueueSize: Int
    var ondequeue: EventHandler<Event, VideoEncoder, EventTarget>?

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

    @JsAsync
    suspend fun flush()

    @JsName("flush")
    fun flushAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/reset)
     */
    fun reset()

    companion object {
        @JsAsync
        suspend fun isConfigSupported(config: VideoEncoderConfig): VideoEncoderSupport

        @JsName("isConfigSupported")
        fun isConfigSupportedAsync(config: VideoEncoderConfig): Promise<VideoEncoderSupport>
    }
}
