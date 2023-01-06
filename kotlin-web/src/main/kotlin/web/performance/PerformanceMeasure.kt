package web.performance

import js.core.HighResTimeStamp

external class PerformanceMeasure : PerformanceEntry {
    val detail: Any

    override val duration: HighResTimeStamp
    override val entryType: String
    override val name: String
    override val startTime: HighResTimeStamp
    override fun toJSON(): Any
}
