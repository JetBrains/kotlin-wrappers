// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
import web.time.DOMHighResTimeStamp

/**
 * The **`PerformanceServerTiming`** interface surfaces server metrics that are sent with the response in the Server-Timing HTTP header.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming)
 */
open external class PerformanceServerTiming
private constructor() {
    /**
     * The **`description`** read-only property returns a string value of the server-specified metric description, or an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/description)
     */
    val description: String

    /**
     * The **`duration`** read-only property returns a double that contains the server-specified metric duration, or the value `0.0`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/duration)
     */
    val duration: DOMHighResTimeStamp

    /**
     * The **`name`** read-only property returns a string value of the server-specified metric name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/name)
     */
    val name: String

    /**
     * The **`toJSON()`** method of the PerformanceServerTiming interface is a Serialization; it returns a JSON representation of the PerformanceServerTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/toJSON)
     */
    fun toJSON(): JsAny
}
