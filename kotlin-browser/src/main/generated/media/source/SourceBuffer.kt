// Automatically generated - do not modify!

package media.source

import kotlinx.js.BufferSource
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class SourceBuffer :
    EventTarget {
    var appendWindowEnd: Number
    var appendWindowStart: Number
    val buffered: TimeRanges
    var mode: AppendMode
    var onabort: EventHandler<Event>?
    var onerror: EventHandler<Event>?
    var onupdate: EventHandler<Event>?
    var onupdateend: EventHandler<Event>?
    var onupdatestart: EventHandler<Event>?
    var timestampOffset: Number
    val updating: Boolean
    fun abort()
    fun appendBuffer(data: BufferSource)
    fun changeType(type: String)
    fun remove(
        start: Number,
        end: Number,
    )
}
