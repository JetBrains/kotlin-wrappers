// Automatically generated - do not modify!

package web.performance

import js.core.HighResTimeStamp

sealed external class PerformanceEntry {
    val duration: HighResTimeStamp
    val entryType: String
    val name: String
    val startTime: HighResTimeStamp
    open fun toJSON(): Any
}
