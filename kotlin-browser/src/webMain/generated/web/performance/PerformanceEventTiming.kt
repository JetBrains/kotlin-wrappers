// Automatically generated - do not modify!

package web.performance

import js.core.UInt53
import web.dom.Node
import web.time.DOMHighResTimeStamp
import kotlin.js.JsAny

/**
 * The `PerformanceEventTiming` interface of the Event Timing API provides insights into the latency of certain event types triggered by user interaction.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming)
 */
open external class PerformanceEventTiming
private constructor() :
    PerformanceEntry {
    /**
     * The read-only **`cancelable`** property returns the associated event's `cancelable` property, indicating whether the event can be canceled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/cancelable)
     */
    val cancelable: Boolean

    /**
     * The read-only **`interactionId`** property of the PerformanceEventTiming interface returns an ID that uniquely identifies a user interaction which triggered a series of associated events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/interactionId)
     */
    val interactionId: UInt53

    /**
     * The read-only **`processingEnd`** property returns the time the last event handler finished executing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/processingEnd)
     */
    val processingEnd: DOMHighResTimeStamp

    /**
     * The read-only **`processingStart`** property returns the time at which event dispatch started.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/processingStart)
     */
    val processingStart: DOMHighResTimeStamp

    /**
     * The read-only **`target`** property returns the associated event's last `target` which is the node onto which the event was last dispatched.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/target)
     */
    val target: Node?

    /**
     * The **`toJSON()`** method of the PerformanceEventTiming interface is a Serialization; it returns a JSON representation of the PerformanceEventTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEventTiming/toJSON)
     */
    override fun toJSON(): JsAny
}
