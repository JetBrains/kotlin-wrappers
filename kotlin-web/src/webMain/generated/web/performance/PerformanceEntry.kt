// Automatically generated - do not modify!

package web.performance

import web.time.DOMHighResTimeStamp
import kotlin.js.JsAny

/**
 * The **`PerformanceEntry`** object encapsulates a single performance metric that is part of the browser's performance timeline.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry)
 */
open external class PerformanceEntry
private constructor() {
    /**
     * The read-only **`duration`** property returns a timestamp that is the duration of the performance entry. The meaning of this property depends on the value of this entry's entryType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/duration)
     */
    val duration: DOMHighResTimeStamp

    /**
     * The read-only **`entryType`** property returns a string representing the type of performance metric that this entry represents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType)
     */
    val entryType: String

    /**
     * The read-only **`name`** property of the PerformanceEntry interface is a string representing the name for a performance entry. It acts as an identifier, but it does not have to be unique. The value depends on the subclass.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/name)
     */
    val name: String

    /**
     * The read-only **`startTime`** property returns the first timestamp recorded for this PerformanceEntry. The meaning of this property depends on the value of this entry's entryType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/startTime)
     */
    val startTime: DOMHighResTimeStamp

    /**
     * The **`toJSON()`** method is a serializer; it returns a JSON representation of the PerformanceEntry object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/toJSON)
     */
    open fun toJSON(): JsAny
}
