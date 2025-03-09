// Automatically generated - do not modify!

package web.timers

import kotlin.time.Duration
import kotlin.time.DurationUnit.MILLISECONDS

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/setInterval)
 */
external fun setInterval(
    handler: TimerHandler,
    timeout: Int = definedExternally,
): Interval

fun setInterval(
    timeout: Duration,
    handler: TimerHandler,
): Interval =
    setInterval(
        handler = handler,
        timeout = timeout.toInt(MILLISECONDS)
    )
