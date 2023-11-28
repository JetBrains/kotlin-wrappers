package web.timers

sealed external interface FrameRequestId

external fun requestAnimationFrame(
    callback: FrameRequestCallback,
): FrameRequestId

external fun cancelAnimationFrame(
    requestId: FrameRequestId,
)
