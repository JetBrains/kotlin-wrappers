// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

external class VideoEncoder(
    init: VideoEncoderInit,
) : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encodeQueueSize) */
    val encodeQueueSize: JsLong
    var ondequeue: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/state) */
    val state: CodecState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/close) */
    fun close()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/configure) */
    fun configure(config: VideoEncoderConfig)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/encode) */
    fun encode(
        frame: VideoFrame,
        options: VideoEncoderEncodeOptions = definedExternally,
    )

    fun flush(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoEncoder/reset) */
    fun reset()

    companion object {
        fun isConfigSupported(config: VideoEncoderConfig): Promise<VideoEncoderSupport>
    }
}
