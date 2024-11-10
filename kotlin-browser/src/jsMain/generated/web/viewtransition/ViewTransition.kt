// Automatically generated - do not modify!

package web.viewtransition

import js.core.Void
import js.promise.Promise

/**
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
