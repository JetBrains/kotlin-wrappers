// Automatically generated - do not modify!

package web.geometry

import js.serialization.Serializable
import kotlin.js.definedExternally

/**
 * A **`DOMRect`** describes the size and position of a rectangle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect)
 */
open external class DOMRect(
    /**
     * The **`x`** property of the DOMRect interface represents the x-coordinate of the rectangle, which is the horizontal distance between the viewport's left edge and the rectangle's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/x)
     */
    override var x: Double = definedExternally,
    /**
     * The **`y`** property of the DOMRect interface represents the y-coordinate of the rectangle, which is the vertical distance between the viewport's top edge and the rectangle's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/y)
     */
    override var y: Double = definedExternally,
    /**
     * The **`width`** property of the DOMRect interface represents the width of the rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/width)
     */
    override var width: Double = definedExternally,
    /**
     * The **`height`** property of the DOMRect interface represents the height of the rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/height)
     */
    override var height: Double = definedExternally,
) : DOMRectReadOnly,
    Serializable {
    companion object {
        /**
         * The **`fromRect()`** static method of the DOMRect object creates a new `DOMRect` object with a given location and dimensions.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/fromRect_static)
         */
        fun fromRect(other: DOMRectReadOnly = definedExternally): DOMRect
    }
}
