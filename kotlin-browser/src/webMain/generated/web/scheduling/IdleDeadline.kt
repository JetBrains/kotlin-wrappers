// Automatically generated - do not modify!

package web.scheduling

import web.time.DOMHighResTimeStamp

/**
 * The **`IdleDeadline`** interface is used as the data type of the input parameter to idle callbacks established by calling Window.requestIdleCallback(). It offers a method, timeRemaining(), which lets you determine how much longer the user agent estimates it will remain idle and a property, didTimeout, which lets you determine if your callback is executing because its timeout duration expired.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline)
 */
open external class IdleDeadline
private constructor() {
    /**
     * The read-only **`didTimeout`** property on the IdleDeadline interface is a Boolean value which indicates whether or not the idle callback is being invoked because the timeout interval specified when Window.requestIdleCallback() was called has expired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/didTimeout)
     */
    val didTimeout: Boolean

    /**
     * The **`timeRemaining()`** method on the IdleDeadline interface returns the estimated number of milliseconds remaining in the current idle period. The callback can call this method at any time to determine how much time it can continue to work before it must return. For example, if the callback finishes a task and has another one to begin, it can call timeRemaining() to see if there's enough time to complete the next task. If there isn't, the callback can just return immediately, or look for other work to do with the remaining time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/timeRemaining)
     */
    fun timeRemaining(): DOMHighResTimeStamp
}
