// Automatically generated - do not modify!

package web.svg

import kotlin.js.JsAny

/**
 * The **`SVGAnimatedEnumeration`** interface describes attribute values which are constants from a particular enumeration and which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedEnumeration)
 */
open external class SVGAnimatedEnumeration<T : JsAny?>
private constructor() {
    /**
     * The **`animVal`** property of the SVGAnimatedEnumeration interface contains the current value of an SVG enumeration. If there is no animation, it is the same value as the baseVal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedEnumeration/animVal)
     */
    val animVal: T

    /**
     * The **`baseVal`** property of the SVGAnimatedEnumeration interface contains the initial value of an SVG enumeration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedEnumeration/baseVal)
     */
    var baseVal: T
}
