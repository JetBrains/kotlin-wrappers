// Automatically generated - do not modify!

package web.media.source

import js.buffer.BufferSource
import web.events.*

/**
 * A chunk of media to be passed into an HTMLMediaElement and played, via a MediaSource object. This can be made up of one or several media segments.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer)
 */
sealed external class SourceBuffer :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowEnd)
     */
    var appendWindowEnd: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowStart)
     */
    var appendWindowStart: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/buffered)
     */
    val buffered: TimeRanges

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode)
     */
    var mode: AppendMode
    var onabort: EventHandler<Event, SourceBuffer, SourceBuffer>?
    var onerror: EventHandler<Event, SourceBuffer, SourceBuffer>?
    var onupdate: EventHandler<Event, SourceBuffer, SourceBuffer>?
    var onupdateend: EventHandler<Event, SourceBuffer, SourceBuffer>?
    var onupdatestart: EventHandler<Event, SourceBuffer, SourceBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/timestampOffset)
     */
    var timestampOffset: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updating)
     */
    val updating: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort)
     */
    fun abort()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendBuffer)
     */
    fun appendBuffer(data: BufferSource)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/changeType)
     */
    fun changeType(type: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/remove)
     */
    fun remove(
        start: Double,
        end: Double,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<Event, SourceBuffer /* this */, SourceBuffer /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, SourceBuffer /* this */, SourceBuffer /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/update_event)
     */
    @JsEvent("update")
    val updateEvent: EventInstance<Event, SourceBuffer /* this */, SourceBuffer /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updateend_event)
     */
    @JsEvent("updateend")
    val updateEndEvent: EventInstance<Event, SourceBuffer /* this */, SourceBuffer /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updatestart_event)
     */
    @JsEvent("updatestart")
    val updateStartEvent: EventInstance<Event, SourceBuffer /* this */, SourceBuffer /* this */>
}
