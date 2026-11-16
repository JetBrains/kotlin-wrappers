// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import js.collections.ListLike
import web.geometry.DOMMatrix

/**
 * The **`CSSTransformValue`** interface of the CSS Typed Object Model API represents transform-list values as used by the CSS transform property. It is an iterable of CSSTransformComponent objects, each representing a single <transform-function>.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue)
 */
open external class CSSTransformValue(
    transforms: ReadonlyArray<CSSTransformComponent>,
) : CSSStyleValue,
    ListLike.Mixin<CSSTransformComponent> {
    /**
     * The **`is2D`** read-only property of the CSSTransformValue interface returns whether the transform is 2D or 3D.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/is2D)
     */
    open val is2D: Boolean

    /**
     * The **`length`** read-only property of the CSSTransformValue interface returns the number of items in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/length)
     */
    override val length: Int

    /**
     * The **`toMatrix()`** method of the CSSTransformValue interface returns a DOMMatrix object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/toMatrix)
     */
    open fun toMatrix(): DOMMatrix
}
