// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp
import web.events.EventTarget

sealed external class PerformanceEventTiming :
    PerformanceEntry {
    val cancelable: Boolean
    val processingEnd: DOMHighResTimeStamp
    val processingStart: DOMHighResTimeStamp
    val target: EventTarget /* Node */?
    override fun toJSON(): Any
}
