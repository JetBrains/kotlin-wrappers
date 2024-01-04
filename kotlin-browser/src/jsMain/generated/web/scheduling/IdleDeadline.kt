// Automatically generated - do not modify!

package web.scheduling

import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline)
 */
sealed external class IdleDeadline {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/didTimeout)
     */
    val didTimeout: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/timeRemaining)
     */
    fun timeRemaining(): DOMHighResTimeStamp
}
