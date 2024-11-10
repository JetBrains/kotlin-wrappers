// Automatically generated - do not modify!

package web.performance

import web.events.EventTarget
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming)
 */
external class PerformanceEventTiming
private constructor() :
    PerformanceEntry {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/cancelable)
     */
    val cancelable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/processingEnd)
     */
    val processingEnd: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/processingStart)
     */
    val processingStart: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/target)
     */
    val target: EventTarget /* Node */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/toJSON)
     */
    override fun toJSON(): Any
}
