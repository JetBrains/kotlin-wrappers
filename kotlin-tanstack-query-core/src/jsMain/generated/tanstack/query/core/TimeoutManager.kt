// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import web.timers.Interval
import web.timers.Timeout
import web.timers.TimerHandler

open external class TimeoutManager {
    open fun setTimeoutProvider(provider: TimeoutProvider)
    open fun setTimeout(
        callback: TimerHandler,
        delay: Int,
    ): Timeout

    open fun clearTimeout(timeoutId: Timeout?)
    open fun setInterval(
        callback: TimerHandler,
        delay: Int,
    ): Interval

    open fun clearInterval(intervalId: Interval?)
}
