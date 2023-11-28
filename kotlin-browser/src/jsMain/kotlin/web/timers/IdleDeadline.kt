package web.timers

import js.core.DOMHighResTimeStamp

sealed external class IdleDeadline {
    val didTimeout: Boolean
    fun timeRemaining(): DOMHighResTimeStamp
}
