package web.animations

sealed external interface FrameRequestId

external fun requestAnimationFrame(
    callback: FrameRequestCallback,
): FrameRequestId

external fun cancelAnimationFrame(
    requestId: FrameRequestId,
)
