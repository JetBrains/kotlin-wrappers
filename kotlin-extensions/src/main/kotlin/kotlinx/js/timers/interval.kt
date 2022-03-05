package kotlinx.js.timers

external fun setInterval(
    callback: () -> Unit,
    ms: Int = definedExternally,
): Timeout

external fun clearInterval(
    intervalId: Timeout,
)
