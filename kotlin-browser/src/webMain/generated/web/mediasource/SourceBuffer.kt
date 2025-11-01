// Automatically generated - do not modify!

package web.mediasource

import js.buffer.BufferSource
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`SourceBuffer`** interface represents a chunk of media to be passed into an HTMLMediaElement and played, via a MediaSource object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer)
 */
open external class SourceBuffer
private constructor() :
    EventTarget {
    /**
     * The **`appendWindowEnd`** property of the SourceBuffer interface controls the timestamp for the end of the append window, a timestamp range that can be used to filter what media data is appended to the `SourceBuffer`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowEnd)
     */
    var appendWindowEnd: Double

    /**
     * The **`appendWindowStart`** property of the SourceBuffer interface controls the timestamp for the start of the append window, a timestamp range that can be used to filter what media data is appended to the `SourceBuffer`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowStart)
     */
    var appendWindowStart: Double

    /**
     * The **`buffered`** read-only property of the SourceBuffer interface returns the time ranges that are currently buffered in the `SourceBuffer` as a normalized TimeRanges object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/buffered)
     */
    val buffered: TimeRanges

    /**
     * The **`mode`** property of the SourceBuffer interface controls whether media segments can be appended to the `SourceBuffer` in any order, or in a strict sequence.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode)
     */
    var mode: AppendMode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort_event)
     */
    var onabort: EventHandler<Event, SourceBuffer, SourceBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/error_event)
     */
    var onerror: EventHandler<Event, SourceBuffer, SourceBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/update_event)
     */
    var onupdate: EventHandler<Event, SourceBuffer, SourceBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updateend_event)
     */
    var onupdateend: EventHandler<Event, SourceBuffer, SourceBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updatestart_event)
     */
    var onupdatestart: EventHandler<Event, SourceBuffer, SourceBuffer>?

    /**
     * The **`timestampOffset`** property of the SourceBuffer interface controls the offset applied to timestamps inside media segments that are appended to the `SourceBuffer`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/timestampOffset)
     */
    var timestampOffset: Double

    /**
     * The **`updating`** read-only property of the SourceBuffer interface indicates whether the `SourceBuffer` is currently being updated — i.e., whether an SourceBuffer.appendBuffer or SourceBuffer.remove operation is currently in progress.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updating)
     */
    val updating: Boolean

    /**
     * The **`abort()`** method of the SourceBuffer interface aborts the current segment and resets the segment parser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort)
     */
    fun abort()

    /**
     * The **`appendBuffer()`** method of the SourceBuffer interface appends media segment data from an ArrayBuffer, a TypedArray or a DataView object to the `SourceBuffer`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendBuffer)
     */
    fun appendBuffer(data: BufferSource)

    /**
     * The **`changeType()`** method of the SourceBuffer interface sets the MIME type that future calls to SourceBuffer.appendBuffer should expect the new media data to conform to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/changeType)
     */
    fun changeType(type: String)

    /**
     * The **`remove()`** method of the SourceBuffer interface removes media segments within a specific time range from the `SourceBuffer`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/remove)
     */
    fun remove(
        start: Double,
        end: Double,
    )
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort_event)
 */
inline val <C : SourceBuffer> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/error_event)
 */
inline val <C : SourceBuffer> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/update_event)
 */
inline val <C : SourceBuffer> C.updateEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "update")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updateend_event)
 */
inline val <C : SourceBuffer> C.updateEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "updateend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updatestart_event)
 */
inline val <C : SourceBuffer> C.updateStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "updatestart")
