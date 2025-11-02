// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSRotate`** interface of the CSS Typed Object Model API represents the rotate value of the individual transform property in CSS. It inherits properties and methods from its parent CSSTransformValue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate)
 */
open external class CSSRotate(
    /**
     * The **`x`** property of the CSSRotate interface gets and sets the abscissa or x-axis of the translating vector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/x)
     */
    var x: CSSNumberish,
    /**
     * The **`y`** property of the CSSRotate interface gets and sets the ordinate or y-axis of the translating vector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/y)
     */
    var y: CSSNumberish,
    /**
     * The **`z`** property of the CSSRotate interface representing the z-component of the translating vector. A positive value moves the element towards the viewer, and a negative value farther away.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/z)
     */
    var z: CSSNumberish,
    /**
     * The **`angle`** property of the CSSRotate interface gets and sets the angle of rotation. A positive angle denotes a clockwise rotation, a negative angle a counter-clockwise one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/angle)
     */
    var angle: CSSNumericValue,
) : CSSTransformComponent {
    constructor(angle: CSSNumericValue)

}
