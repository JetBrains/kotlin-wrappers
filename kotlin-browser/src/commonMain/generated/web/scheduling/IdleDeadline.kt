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
     * The read-only **`didTimeout`** property on the **IdleDeadline** interface is a Boolean value which indicates whether or not the idle callback is being invoked because the timeout interval specified when Window.requestIdleCallback() was called has expired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/didTimeout)
     */
    val didTimeout: Boolean

    /**
     * The **`timeRemaining()`** method on the IdleDeadline interface returns the estimated number of milliseconds remaining in the current idle period.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/timeRemaining)
     */
    fun timeRemaining(): DOMHighResTimeStamp
}
