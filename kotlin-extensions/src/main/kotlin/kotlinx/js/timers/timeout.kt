package kotlinx.js.timers

sealed external interface Timeout

external fun setTimeout(
    callback: () -> Unit,
    ms: Int = definedExternally,
): Timeout

external fun clearTimeout(
    timeoutId: Timeout,
)
