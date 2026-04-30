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
    var animation: CSSAnimation?
    var animationName: String?
    var elapsedTime: Double?
    var pseudoElement: String?
}
