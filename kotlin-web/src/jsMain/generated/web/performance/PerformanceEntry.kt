// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp

sealed external class PerformanceEntry {
    val duration: DOMHighResTimeStamp
    val entryType: String
    val name: String
    val startTime: DOMHighResTimeStamp
    open fun toJSON(): Any
}
