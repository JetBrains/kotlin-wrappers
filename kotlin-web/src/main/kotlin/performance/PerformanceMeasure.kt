package performance

import kotlinx.js.HighResTimeStamp

interface PerformanceMeasureOptions {
    var detail: Any?
    var duration: HighResTimeStamp?
    var end: HighResTimeStamp?
    var start: HighResTimeStamp?
}

external class PerformanceMeasure : PerformanceEntry {
    val detail: Any

    override val duration: HighResTimeStamp
    override val entryType: String
    override val name: String
    override val startTime: HighResTimeStamp
    override fun toJSON(): Any
}
