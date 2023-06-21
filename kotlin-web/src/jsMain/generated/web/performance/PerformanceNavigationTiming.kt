// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp

sealed external class PerformanceNavigationTiming :
    PerformanceResourceTiming {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domComplete) */
    val domComplete: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventEnd) */
    val domContentLoadedEventEnd: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventStart) */
    val domContentLoadedEventStart: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domInteractive) */
    val domInteractive: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventEnd) */
    val loadEventEnd: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventStart) */
    val loadEventStart: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/redirectCount) */
    val redirectCount: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type) */
    val type: NavigationTimingType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventEnd) */
    val unloadEventEnd: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventStart) */
    val unloadEventStart: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/toJSON) */
    override fun toJSON(): Any
}
