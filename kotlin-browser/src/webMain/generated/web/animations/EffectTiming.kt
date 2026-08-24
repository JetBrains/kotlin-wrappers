// Automatically generated - do not modify!

package web.animations

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#return_value)
 */
@JsPlainObject
external interface EffectTiming {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#delay)
     */
    var delay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#direction)
     */
    var direction: PlaybackDirection?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#duration)
     */
    var duration: JsAny /* number | CSSNumericValue | string */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#easing)
     */
    var easing: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#enddelay)
     */
    var endDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#fill)
     */
    var fill: FillMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#iterationstart)
     */
    var iterationStart: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#iterations)
     */
    var iterations: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming#playbackrate)
     */
    var playbackRate: Double?
}
