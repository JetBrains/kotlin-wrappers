// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

external class VideoDecoder(
    init: VideoDecoderInit,
) : EventTarget {
    val decodeQueueSize: JsLong
    var ondequeue: EventHandler<Event>?
    val state: CodecState
    fun close()
    fun configure(config: VideoDecoderConfig)
    fun decode(chunk: EncodedVideoChunk)
    fun flush(): Promise<Void>
    fun reset()

    companion object {
        fun isConfigSupported(config: VideoDecoderConfig): Promise<VideoDecoderSupport>
    }
}
