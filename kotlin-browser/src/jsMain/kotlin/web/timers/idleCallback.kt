package web.timers

import js.core.HighResTimeStamp

sealed external interface IdleRequestId

sealed external class IdleDeadline {
    val didTimeout: Boolean
    fun timeRemaining(): HighResTimeStamp
}

typealias IdleRequestCallback = (
    deadline: IdleDeadline
) -> Unit

external fun requestIdleCallback(
    callback: IdleRequestCallback,
): IdleRequestId

external fun cancelIdleCallback(
    requestId: IdleRequestId,
)
