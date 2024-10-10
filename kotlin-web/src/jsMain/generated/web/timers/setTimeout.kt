// Automatically generated - do not modify!

package web.timers

import kotlin.time.Duration
import kotlin.time.DurationUnit.MILLISECONDS

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/setTimeout)
 */
external fun setTimeout(
    handler: TimerHandler,
    timeout: Int = definedExternally,
): Timeout

fun setTimeout(
    timeout: Duration,
    handler: TimerHandler,
): Timeout =
    setTimeout(
        handler = handler,
        timeout = timeout.toInt(MILLISECONDS)
    )
