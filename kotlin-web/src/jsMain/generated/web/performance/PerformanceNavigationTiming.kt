// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp

sealed external class PerformanceNavigationTiming :
    PerformanceResourceTiming {
    val domComplete: DOMHighResTimeStamp
    val domContentLoadedEventEnd: DOMHighResTimeStamp
    val domContentLoadedEventStart: DOMHighResTimeStamp
    val domInteractive: DOMHighResTimeStamp
    val loadEventEnd: DOMHighResTimeStamp
    val loadEventStart: DOMHighResTimeStamp
    val redirectCount: Int
    val type: NavigationTimingType
    val unloadEventEnd: DOMHighResTimeStamp
    val unloadEventStart: DOMHighResTimeStamp
    override fun toJSON(): Any
}
