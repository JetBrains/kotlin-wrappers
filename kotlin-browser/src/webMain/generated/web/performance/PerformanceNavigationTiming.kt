// Automatically generated - do not modify!

package web.performance

import web.time.DOMHighResTimeStamp

/**
 * The **`PerformanceNavigationTiming`** interface provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming)
 */
open external class PerformanceNavigationTiming
private constructor() :
    PerformanceResourceTiming {
    /**
     * The **`domComplete`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the user agent sets the document's readyState to "complete".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domComplete)
     */
    open val domComplete: DOMHighResTimeStamp

    /**
     * The **`domContentLoadedEventEnd`** read-only property returns a DOMHighResTimeStamp representing the time immediately after the current document's DOMContentLoaded event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventEnd)
     */
    open val domContentLoadedEventEnd: DOMHighResTimeStamp

    /**
     * The **`domContentLoadedEventStart`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the current document's DOMContentLoaded event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventStart)
     */
    open val domContentLoadedEventStart: DOMHighResTimeStamp

    /**
     * The **`domInteractive`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the user agent sets the document's readyState to "interactive".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domInteractive)
     */
    open val domInteractive: DOMHighResTimeStamp

    /**
     * The **`loadEventEnd`** read-only property returns a DOMHighResTimeStamp representing the time immediately after the current document's load event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventEnd)
     */
    open val loadEventEnd: DOMHighResTimeStamp

    /**
     * The **`loadEventStart`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the current document's load event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventStart)
     */
    open val loadEventStart: DOMHighResTimeStamp

    /**
     * The **`redirectCount`** read-only property returns a number representing the number of redirects since the last non-redirect navigation in the current browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/redirectCount)
     */
    open val redirectCount: Short

    /**
     * The **`type`** read-only property returns the type of navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type)
     */
    open val type: NavigationTimingType

    /**
     * The **`unloadEventEnd`** read-only property returns a DOMHighResTimeStamp representing the time immediately after the previous document's unload event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventEnd)
     */
    open val unloadEventEnd: DOMHighResTimeStamp

    /**
     * The **`unloadEventStart`** read-only property returns a DOMHighResTimeStamp representing the time immediately before the previous document's unload event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventStart)
     */
    open val unloadEventStart: DOMHighResTimeStamp

    /**
     * The **`toJSON()`** method of the PerformanceNavigationTiming interface returns a JSON-serializable plain object representing the PerformanceNavigationTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/toJSON)
     */
    override fun toJSON(): JsAny
}
