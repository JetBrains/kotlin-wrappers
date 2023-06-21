// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp

sealed external class PerformanceEntry {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/duration) */
    val duration: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType) */
    val entryType: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/name) */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/startTime) */
    val startTime: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/toJSON) */
    open fun toJSON(): Any
}
