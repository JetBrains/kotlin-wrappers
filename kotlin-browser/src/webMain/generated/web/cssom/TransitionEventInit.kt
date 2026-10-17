// Automatically generated - do not modify!

package web.cssom

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/TransitionEvent#options)
 */
@JsPlainObject
external interface TransitionEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/TransitionEvent#animation)
     */
    var animation: CSSTransition?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/TransitionEvent#elapsedTime)
     */
    var elapsedTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/TransitionEvent#propertyName)
     */
    var propertyName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/TransitionEvent#pseudoElement)
     */
    var pseudoElement: String?
}
