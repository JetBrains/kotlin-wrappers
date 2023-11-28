package web.timers

sealed external interface IdleRequestId

external fun requestIdleCallback(
    callback: IdleRequestCallback,
): IdleRequestId

external fun cancelIdleCallback(
    requestId: IdleRequestId,
)
