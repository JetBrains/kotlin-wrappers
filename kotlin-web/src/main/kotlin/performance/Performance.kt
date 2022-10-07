package performance

import kotlinx.js.HighResTimeStamp
import org.w3c.dom.events.Event
import web.events.EventTarget

sealed external class Performance : EventTarget {
    var onresourcetimingbufferfull: ((event: Event) -> Unit)?
    val timeOrigin: HighResTimeStamp
    fun clearMarks(markName: String = definedExternally)
    fun clearMeasures(measureName: String = definedExternally)
    fun clearResourceTimings()
    fun getEntries(): PerformanceEntryList
    fun getEntriesByName(name: String, type: String = definedExternally): PerformanceEntryList
    fun getEntriesByType(type: String): PerformanceEntryList
    fun mark(markName: String, markOptions: PerformanceMarkOptions = definedExternally): PerformanceMark
    fun measure(measureName: String, startOrMeasureOptions: String = definedExternally, endMark: String = definedExternally): PerformanceMeasure
    fun measure(measureName: String, startOrMeasureOptions: PerformanceMeasureOptions = definedExternally, endMark: String = definedExternally): PerformanceMeasure
    fun now(): HighResTimeStamp
    fun setResourceTimingBufferSize(maxSize: Number)
    fun toJSON(): Any
}
