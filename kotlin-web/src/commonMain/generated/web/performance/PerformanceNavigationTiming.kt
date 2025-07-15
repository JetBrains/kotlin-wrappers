// Automatically generated - do not modify!

package web.performance

import js.core.JsAny
import web.time.DOMHighResTimeStamp

/**
 * The **`PerformanceNavigationTiming`** interface provides methods and properties to store and retrieve metrics regarding the browser's document navigation events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming)
 */
external class PerformanceNavigationTiming
private constructor() :
    PerformanceResourceTiming {
    /**
     * The **`domComplete`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the user agent sets the document's `readyState` to `'complete'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domComplete)
     */
    val domComplete: DOMHighResTimeStamp

    /**
     * The **`domContentLoadedEventEnd`** read-only property returns a DOMHighResTimeStamp representing the time immediately after the current document's `DOMContentLoaded` event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventEnd)
     */
    val domContentLoadedEventEnd: DOMHighResTimeStamp

    /**
     * The **`domContentLoadedEventStart`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the current document's `DOMContentLoaded` event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventStart)
     */
    val domContentLoadedEventStart: DOMHighResTimeStamp

    /**
     * The **`domInteractive`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the user agent sets the document's `readyState` to `'interactive'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domInteractive)
     */
    val domInteractive: DOMHighResTimeStamp

    /**
     * The **`loadEventEnd`** read-only property returns a DOMHighResTimeStamp representing the time immediately after the current document's `load` event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventEnd)
     */
    val loadEventEnd: DOMHighResTimeStamp

    /**
     * The **`loadEventStart`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the current document's `load` event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventStart)
     */
    val loadEventStart: DOMHighResTimeStamp

    /**
     * The **`redirectCount`** read-only property returns a number representing the number of redirects since the last non-redirect navigation in the current browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/redirectCount)
     */
    val redirectCount: Short

    /**
     * The **`type`** read-only property returns the type of navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type)
     */
    val type: NavigationTimingType

    /**
     * The **`unloadEventEnd`** read-only property returns a DOMHighResTimeStamp representing the time immediately after the previous document's `unload` event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventEnd)
     */
    val unloadEventEnd: DOMHighResTimeStamp

    /**
     * The **`unloadEventStart`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the previous document's `unload` event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventStart)
     */
    val unloadEventStart: DOMHighResTimeStamp

    /**
     * The **`toJSON()`** method of the PerformanceNavigationTiming interface is a Serialization; it returns a JSON representation of the PerformanceNavigationTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/toJSON)
     */
    override fun toJSON(): JsAny
}
