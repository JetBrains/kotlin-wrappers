// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.time.DOMHighResTimeStamp
import kotlin.js.definedExternally

/**
 * The **`Performance`** interface provides access to performance-related information for the current page.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance)
 */
external class Performance
private constructor() :
    EventTarget {
    /**
     * The read-only `performance.eventCounts` property is an EventCounts map containing the number of events which have been dispatched per event type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/eventCounts)
     */
    val eventCounts: EventCounts

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/resourcetimingbufferfull_event)
     */
    var onresourcetimingbufferfull: EventHandler<Event, Performance, Performance>?

    /**
     * The **`timeOrigin`** read-only property of the Performance interface returns the high resolution timestamp that is used as the baseline for performance-related timestamps.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/timeOrigin)
     */
    val timeOrigin: DOMHighResTimeStamp

    /**
     * The **`clearMarks()`** method removes all or specific PerformanceMark objects from the browser's performance timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearMarks)
     */
    fun clearMarks(markName: String = definedExternally)

    /**
     * The **`clearMeasures()`** method removes all or specific PerformanceMeasure objects from the browser's performance timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearMeasures)
     */
    fun clearMeasures(measureName: String = definedExternally)

    /**
     * The **`clearResourceTimings()`** method removes all performance entries with an PerformanceEntry.entryType of `'resource'` from the browser's performance timeline and sets the size of the performance resource data buffer to zero.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearResourceTimings)
     */
    fun clearResourceTimings()

    /**
     * The **`getEntries()`** method returns an array of all PerformanceEntry objects currently present in the performance timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntries)
     */
    fun getEntries(): PerformanceEntryList

    /**
     * The **`getEntriesByName()`** method returns an array of PerformanceEntry objects currently present in the performance timeline with the given _name_ and _type_.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntriesByName)
     */
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    /**
     * The **`getEntriesByType()`** method returns an array of PerformanceEntry objects currently present in the performance timeline for a given _type_.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntriesByType)
     */
    fun getEntriesByType(type: String): PerformanceEntryList

    /**
     * The **`mark()`** method creates a named PerformanceMark object representing a high resolution timestamp marker in the browser's performance timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/mark)
     */
    fun mark(
        markName: String,
        markOptions: PerformanceMarkOptions = definedExternally,
    ): PerformanceMark

    /**
     * The **`measure()`** method creates a named PerformanceMeasure object representing a time measurement between two marks in the browser's performance timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure)
     */
    fun measure(
        measureName: String,
        startOrMeasureOptions: String = definedExternally,
        endMark: String = definedExternally,
    ): PerformanceMeasure

    fun measure(
        measureName: String,
        startOrMeasureOptions: PerformanceMeasureOptions,
        endMark: String = definedExternally,
    ): PerformanceMeasure

    /**
     * The **`performance.now()`** method returns a high resolution timestamp in milliseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/now)
     */
    fun now(): DOMHighResTimeStamp

    /**
     * The **`setResourceTimingBufferSize()`** method sets the desired size of the browser's resource timing buffer which stores the `'resource'` performance entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/setResourceTimingBufferSize)
     */
    fun setResourceTimingBufferSize(maxSize: Int)

    /**
     * The **`toJSON()`** method of the Performance interface is a Serialization; it returns a JSON representation of the Performance object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/toJSON)
     */
    fun toJSON(): JsAny
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/resourcetimingbufferfull_event)
 */
inline val <C : Performance> C.resourceTimingBufferFullEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "resourcetimingbufferfull")
