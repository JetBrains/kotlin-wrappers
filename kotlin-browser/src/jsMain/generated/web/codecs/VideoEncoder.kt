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
    val encodeQueueSize: JsLong
    var ondequeue: EventHandler<Event>?
    val state: CodecState
    fun close()
    fun configure(config: VideoEncoderConfig)
    fun encode(
        frame: VideoFrame,
        options: VideoEncoderEncodeOptions = definedExternally,
    )

    fun flush(): Promise<Void>
    fun reset()

    companion object {
        fun isConfigSupported(config: VideoEncoderConfig): Promise<VideoEncoderSupport>
    }
}
