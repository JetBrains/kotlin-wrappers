// Automatically generated - do not modify!

package web.viewtransition

import js.core.Void
import js.promise.Promise

/**
 * The **`ViewTransition`** interface of the View Transition API represents an active view transition, and provides functionality to react to the transition reaching different states (e.g., ready to run the animation, or animation finished) or skip the transition altogether.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition)
 */
external class ViewTransition
private constructor() {
    /**
     * The **`finished`** read-only property of the `finished` will only reject in the case of a same-document (SPA) transition, if the callback passed to Document.startViewTransition() throws or returns a promise that rejects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/finished)
     */
    val finished: Promise<Void>

    /**
     * The **`ready`** read-only property of the `ready` will reject if the transition cannot begin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/ready)
     */
    val ready: Promise<Void>
    var types: ViewTransitionTypeSet

    /**
     * The **`updateCallbackDone`** read-only property of the `updateCallbackDone` is useful when you don't care about the success/failure of a same-document (SPA) view transition animation, and just want to know if and when the DOM is updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/updateCallbackDone)
     */
    val updateCallbackDone: Promise<Void>

    /**
     * The **`skipTransition()`** method of the ```js-nolint skipTransition() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/skipTransition)
     */
    fun skipTransition()
}
