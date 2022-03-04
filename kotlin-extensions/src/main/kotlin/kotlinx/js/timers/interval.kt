package kotlinx.js.timers

external fun setInterval(
    callback: () -> Unit,
    ms: Double = definedExternally,
): Timeout

external fun clearInterval(
    intervalId: Timeout,
)
