// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGAnimatedBoolean`** interface is used for attributes of type boolean which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedBoolean)
 */
open external class SVGAnimatedBoolean
private constructor() {
    /**
     * The **`animVal`** read-only property of the SVGAnimatedBoolean interface represents the current animated value of the associated animatable boolean SVG attribute. If the attribute is not animated, animVal is the same as SVGAnimatedBoolean.baseVal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedBoolean/animVal)
     */
    val animVal: Boolean

    /**
     * The **`baseVal`** property of the SVGAnimatedBoolean interface is the value of the associated animatable boolean SVG attribute in its base (none-animated) state. It reflects the value of the associated animatable boolean attribute when no animations are applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedBoolean/baseVal)
     */
    var baseVal: Boolean
}
