// Automatically generated - do not modify!

package web.animations

import kotlinx.js.JsPlainObject
import web.cssom.CSSAnimation
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/AnimationEvent#options)
 */
@JsPlainObject
external interface AnimationEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/AnimationEvent#animation)
     */
    var animation: CSSAnimation?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/AnimationEvent#animationName)
     */
    var animationName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/AnimationEvent#elapsedTime)
     */
    var elapsedTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/AnimationEvent#pseudoElement)
     */
    var pseudoElement: String?
}
