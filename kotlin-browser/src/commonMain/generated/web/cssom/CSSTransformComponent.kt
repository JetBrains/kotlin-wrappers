// Automatically generated - do not modify!

package web.cssom

import web.geometry.DOMMatrix

/**
 * The **`CSSTransformComponent`** interface of the CSS Typed Object Model API is part of the CSSTransformValue interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent)
 */
open external class CSSTransformComponent
private constructor() {
    /**
     * The **`is2D`** read-only property of the CSSTransformComponent interface indicates where the transform is 2D or 3D.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D)
     */
    var is2D: Boolean

    /**
     * The **`toMatrix()`** method of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix)
     */
    fun toMatrix(): DOMMatrix
}
