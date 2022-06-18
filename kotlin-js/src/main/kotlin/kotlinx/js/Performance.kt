package kotlinx.js

import org.w3c.dom.events.Event

external interface PerformanceEntry {
    val duration: HighResTimeStamp
    val entryType: String
    val name: String
    val startTime: HighResTimeStamp
    fun toJSON(): Any
}

typealias PerformanceEntryList = ReadonlyArray<PerformanceEntry>

external class PerformanceMark(
    markName: String,
    markOptions: PerformanceMarkOptions = definedExternally,
) : PerformanceEntry {
    val detail: Any

    override val duration: HighResTimeStamp
    override val entryType: String
    override val name: String
    override val startTime: HighResTimeStamp
    override fun toJSON(): Any
}

external interface PerformanceMarkOptions {
    var detail: Any?
    var startTime: HighResTimeStamp?
}

external class PerformanceMeasure : PerformanceEntry {
    val detail: Any

    override val duration: HighResTimeStamp
    override val entryType: String
    override val name: String
    override val startTime: HighResTimeStamp
    override fun toJSON(): Any
}

interface PerformanceMeasureOptions {
    var detail: Any?
    var duration: HighResTimeStamp?
    var end: HighResTimeStamp?
    var start: HighResTimeStamp?
}

external interface Performance {
    var onresourcetimingbufferfull: ((ev: Event) -> Any)?
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

external val performance: Performance
