// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
import web.time.DOMHighResTimeStamp

/**
 * The **`PerformanceServerTiming`** interface surfaces server metrics that are sent with the response in the Server-Timing HTTP header.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming)
 */
external class PerformanceServerTiming
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/description)
     */
    val description: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/duration)
     */
    val duration: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/toJSON)
     */
    fun toJSON(): JsAny
}
