// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMRect
import web.geometry.DOMRectReadOnly

/**
 * The **`SVGAnimatedRect`** interface represents an SVGRect attribute that can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect)
 */
open external class SVGAnimatedRect
private constructor() {
    /**
     * The **`animVal`** read-only property of the SVGAnimatedRect interface represents the current animated value of the viewBox attribute of an SVG element as a read-only DOMRectReadOnly object. It provides access to the rectangle's dynamic state, including the x, y, width, and height values during the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect/animVal)
     */
    val animVal: DOMRectReadOnly

    /**
     * The **`baseVal`** read-only property of the SVGAnimatedRect interface represents the current non-animated value of the viewBox attribute of an SVG element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect/baseVal)
     */
    val baseVal: DOMRect
}
