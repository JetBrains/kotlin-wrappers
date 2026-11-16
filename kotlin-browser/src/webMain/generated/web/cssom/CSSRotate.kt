// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSRotate`** interface of the CSS Typed Object Model API represents the value of a rotation function in the transform property in CSS.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate)
 */
open external class CSSRotate(
    /**
     * The **`x`** property of the CSSRotate interface represents the x-coordinate of the vector denoting the axis of rotation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/x)
     */
    open var x: CSSNumberish,
    /**
     * The **`y`** property of the CSSRotate interface represents the y-coordinate of the vector denoting the axis of rotation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/y)
     */
    open var y: CSSNumberish,
    /**
     * The **`z`** property of the CSSRotate interface represents the z-coordinate of the vector denoting the axis of rotation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/z)
     */
    open var z: CSSNumberish,
    /**
     * The **`angle`** property of the CSSRotate interface represents the angle of rotation. A positive angle denotes a clockwise rotation, a negative angle a counter-clockwise one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/angle)
     */
    open var angle: CSSNumericValue,
) : CSSTransformComponent {
    constructor(angle: CSSNumericValue)

}
