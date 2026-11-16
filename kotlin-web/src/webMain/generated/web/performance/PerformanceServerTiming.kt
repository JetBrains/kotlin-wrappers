// Automatically generated - do not modify!

package web.performance

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
    open val description: String

    /**
     * The **`duration`** read-only property returns a double that contains the server-specified metric duration (usually in milliseconds), or the value 0.0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/duration)
     */
    open val duration: DOMHighResTimeStamp

    /**
     * The **`name`** read-only property returns a string value of the server-specified metric name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/name)
     */
    open val name: String

    /**
     * The **`toJSON()`** method of the PerformanceServerTiming interface returns a JSON-serializable plain object representing the PerformanceServerTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceServerTiming/toJSON)
     */
    open fun toJSON(): JsAny
}
