// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject
import web.timers.Interval
import web.timers.Timeout
import web.timers.TimerHandler

@JsPlainObject
external interface TimeoutProvider {
    val setTimeout: (callback: TimerHandler, delay: Int) -> Timeout
    val clearTimeout: (timeoutId: Timeout?) -> Unit
    val setInterval: (callback: TimerHandler, delay: Int) -> Interval
    val clearInterval: (intervalId: Interval?) -> Unit
}
