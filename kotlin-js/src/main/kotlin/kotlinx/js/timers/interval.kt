package kotlinx.js.timers

import kotlin.time.Duration
import kotlin.time.DurationUnit.MILLISECONDS

external fun setInterval(
    callback: () -> Unit,
    ms: Int = definedExternally,
): Timeout

external fun clearInterval(
    intervalId: Timeout,
)

// extensions

fun setInterval(
    delay: Duration,
    callback: () -> Unit,
): Timeout =
    setInterval(
        callback,
        delay.toInt(MILLISECONDS)
    )
