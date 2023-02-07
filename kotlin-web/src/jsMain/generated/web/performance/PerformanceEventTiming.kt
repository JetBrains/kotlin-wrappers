// Automatically generated - do not modify!

package web.performance

import js.core.HighResTimeStamp
import web.events.EventTarget

sealed external class PerformanceEventTiming :
    PerformanceEntry {
    val cancelable: Boolean
    val processingEnd: HighResTimeStamp
    val processingStart: HighResTimeStamp
    val target: EventTarget /* Node */?
    override fun toJSON(): Any
}
