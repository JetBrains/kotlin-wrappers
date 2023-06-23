// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * Provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance)
 */
sealed external class Performance :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/eventCounts) */
    val eventCounts: EventCounts

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/resourcetimingbufferfull_event) */
    var onresourcetimingbufferfull: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/timeOrigin) */
    val timeOrigin: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearMarks) */
    fun clearMarks(markName: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearMeasures) */
    fun clearMeasures(measureName: String = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearResourceTimings) */
    fun clearResourceTimings()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntries) */
    fun getEntries(): PerformanceEntryList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntriesByName) */
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntriesByType) */
    fun getEntriesByType(type: String): PerformanceEntryList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/mark) */
    fun mark(
        markName: String,
        markOptions: PerformanceMarkOptions = definedExternally,
    ): PerformanceMark

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/measure) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/now) */
    fun now(): DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/setResourceTimingBufferSize) */
    fun setResourceTimingBufferSize(maxSize: Number)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/toJSON) */
    fun toJSON(): Any
}
