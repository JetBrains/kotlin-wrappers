// Automatically generated - do not modify!

package media.source

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class MediaSource :
    EventTarget {
    val activeSourceBuffers: SourceBufferList
    var duration: Double
    var onsourceclose: EventHandler<Event>?
    var onsourceended: EventHandler<Event>?
    var onsourceopen: EventHandler<Event>?
    val readyState: ReadyState
    val sourceBuffers: SourceBufferList
    fun addSourceBuffer(type: String): SourceBuffer
    fun clearLiveSeekableRange()
    fun endOfStream(error: EndOfStreamError = definedExternally)
    fun removeSourceBuffer(sourceBuffer: SourceBuffer)
    fun setLiveSeekableRange(
        start: Number,
        end: Number,
    )
}
