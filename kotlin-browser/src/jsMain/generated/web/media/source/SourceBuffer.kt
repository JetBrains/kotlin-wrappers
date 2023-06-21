// Automatically generated - do not modify!

package web.media.source

import js.buffer.BufferSource
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class SourceBuffer :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowEnd) */
    var appendWindowEnd: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowStart) */
    var appendWindowStart: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/buffered) */
    val buffered: TimeRanges

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode) */
    var mode: AppendMode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort_event) */
    var onabort: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/error_event) */
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/update_event) */
    var onupdate: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updateend_event) */
    var onupdateend: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updatestart_event) */
    var onupdatestart: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/timestampOffset) */
    var timestampOffset: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updating) */
    val updating: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort) */
    fun abort()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendBuffer) */
    fun appendBuffer(data: BufferSource)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/changeType) */
    fun changeType(type: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/remove) */
    fun remove(
        start: Number,
        end: Number,
    )
}
