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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/finished)
     */
    val finished: Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/ready)
     */
    val ready: Promise<Void>
    var types: ViewTransitionTypeSet

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/updateCallbackDone)
     */
    val updateCallbackDone: Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/skipTransition)
     */
    fun skipTransition()
}
