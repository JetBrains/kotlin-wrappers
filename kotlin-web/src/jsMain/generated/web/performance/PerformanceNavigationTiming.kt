// Automatically generated - do not modify!

package web.performance

import js.core.HighResTimeStamp

sealed external class PerformanceNavigationTiming :
    PerformanceResourceTiming {
    val domComplete: HighResTimeStamp
    val domContentLoadedEventEnd: HighResTimeStamp
    val domContentLoadedEventStart: HighResTimeStamp
    val domInteractive: HighResTimeStamp
    val loadEventEnd: HighResTimeStamp
    val loadEventStart: HighResTimeStamp
    val redirectCount: Int
    val type: NavigationTimingType
    val unloadEventEnd: HighResTimeStamp
    val unloadEventStart: HighResTimeStamp
    override fun toJSON(): Any
}
