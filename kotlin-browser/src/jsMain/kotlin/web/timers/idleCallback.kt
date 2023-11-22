package web.timers

import js.core.DOMHighResTimeStamp

sealed external interface IdleRequestId

sealed external class IdleDeadline {
    val didTimeout: Boolean
    fun timeRemaining(): DOMHighResTimeStamp
}

typealias IdleRequestCallback = (
    deadline: IdleDeadline,
) -> Unit

external fun requestIdleCallback(
    callback: IdleRequestCallback,
): IdleRequestId

external fun cancelIdleCallback(
    requestId: IdleRequestId,
)
