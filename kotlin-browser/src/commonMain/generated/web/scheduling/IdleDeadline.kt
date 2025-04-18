// Automatically generated - do not modify!

package web.scheduling

import web.time.DOMHighResTimeStamp

/**
 * The `IdleDeadline` interface is used as the data type of the input parameter to idle callbacks established by calling Window.requestIdleCallback().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline)
 */
external class IdleDeadline
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/didTimeout)
     */
    val didTimeout: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/timeRemaining)
     */
    fun timeRemaining(): DOMHighResTimeStamp
}
