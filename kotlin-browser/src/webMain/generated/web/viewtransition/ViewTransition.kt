// Automatically generated - do not modify!

package web.viewtransition

import js.core.Void
import js.promise.Promise

/**
 * The **`ViewTransition`** interface of the View Transition API represents an active view transition, and provides functionality to react to the transition reaching different states (e.g., ready to run the animation, or animation finished) or skip the transition altogether.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition)
 */
open external class ViewTransition
private constructor() {
    /**
     * The **`finished`** read-only property of the ViewTransition interface is a Promise that fulfills once the transition animation is finished, and the new page view is visible and interactive to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/finished)
     */
    val finished: Promise<Void>

    /**
     * The **`ready`** read-only property of the ViewTransition interface is a Promise that fulfills once the pseudo-element tree is created and the transition animation is about to start.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/ready)
     */
    val ready: Promise<Void>

    /**
     * The **`types`** read-only property of the ViewTransition interface is a ViewTransitionTypeSet that allows the types set on the view transition to be accessed and modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/types)
     */
    var types: ViewTransitionTypeSet

    /**
     * The **`updateCallbackDone`** read-only property of the ViewTransition interface is a Promise that fulfills when the promise returned by the document.startViewTransition() method's callback fulfills, or rejects when it rejects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/updateCallbackDone)
     */
    val updateCallbackDone: Promise<Void>

    /**
     * The **`skipTransition()`** method of the ViewTransition interface skips the animation part of the view transition, but doesn't skip running the associated view update.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/skipTransition)
     */
    fun skipTransition()
}
