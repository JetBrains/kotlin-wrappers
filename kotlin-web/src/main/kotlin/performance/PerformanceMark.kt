package performance

import kotlinx.js.HighResTimeStamp

external interface PerformanceMarkOptions {
    var detail: Any?
    var startTime: HighResTimeStamp?
}

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
