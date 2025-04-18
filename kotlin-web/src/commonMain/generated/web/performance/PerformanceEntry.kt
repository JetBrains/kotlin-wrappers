// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
import web.time.DOMHighResTimeStamp

/**
 * The **`PerformanceEntry`** object encapsulates a single performance metric that is part of the browser's performance timeline.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry)
 */
open external class PerformanceEntry
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/duration)
     */
    val duration: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType)
     */
    val entryType: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/startTime)
     */
    val startTime: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/toJSON)
     */
    open fun toJSON(): JsAny
}
