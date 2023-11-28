package web.timers

sealed external interface Immediate

external fun setImmediate(
    callback: () -> Unit,
): Immediate

external fun clearImmediate(
    immediateId: Immediate,
)
