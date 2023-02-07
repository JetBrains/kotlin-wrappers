// Automatically generated - do not modify!

package web.performance

import js.core.HighResTimeStamp
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class Performance :
    EventTarget {
    val eventCounts: EventCounts
    var onresourcetimingbufferfull: EventHandler<Event>?
    val timeOrigin: HighResTimeStamp
    fun clearMarks(markName: String = definedExternally)
    fun clearMeasures(measureName: String = definedExternally)
    fun clearResourceTimings()
    fun getEntries(): PerformanceEntryList
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    fun getEntriesByType(type: String): PerformanceEntryList
    fun mark(
        markName: String,
        markOptions: PerformanceMarkOptions = definedExternally,
    ): PerformanceMark

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

    fun now(): HighResTimeStamp
    fun setResourceTimingBufferSize(maxSize: Number)
    fun toJSON(): Any
}
