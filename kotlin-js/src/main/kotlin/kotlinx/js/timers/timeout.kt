package kotlinx.js.timers

import kotlin.time.Duration
import kotlin.time.DurationUnit

sealed external interface Timeout

external fun setTimeout(
    callback: () -> Unit,
    ms: Int = definedExternally,
): Timeout

external fun clearTimeout(
    timeoutId: Timeout,
)

// extensions

fun setTimeout(
    delay: Duration,
    callback: () -> Unit,
): Timeout =
    setTimeout(
        callback,
        delay.toInt(DurationUnit.MILLISECONDS)
    )

