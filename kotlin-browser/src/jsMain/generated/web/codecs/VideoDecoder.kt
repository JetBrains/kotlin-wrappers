// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder)
 */
external class VideoDecoder(
    init: VideoDecoderInit,
) : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decodeQueueSize) */
    val decodeQueueSize: JsLong
    var ondequeue: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/state) */
    val state: CodecState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/close) */
    fun close()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/configure) */
    fun configure(config: VideoDecoderConfig)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/decode) */
    fun decode(chunk: EncodedVideoChunk)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/flush) */
    fun flush(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoDecoder/reset) */
    fun reset()

    companion object {
        fun isConfigSupported(config: VideoDecoderConfig): Promise<VideoDecoderSupport>
    }
}
