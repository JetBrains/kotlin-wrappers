package web.timers

import js.core.DOMHighResTimeStamp

sealed external interface FrameRequestId

typealias FrameRequestCallback = (
    time: DOMHighResTimeStamp,
) -> Unit

external fun requestAnimationFrame(
    callback: FrameRequestCallback,
): FrameRequestId

external fun cancelAnimationFrame(
    requestId: FrameRequestId,
)
