// Automatically generated - do not modify!

package web.geometry

import js.core.JsAny
import js.serialization.Serializable
import kotlin.js.definedExternally

/**
 * The **`DOMRectReadOnly`** interface specifies the standard properties (also used by DOMRect) to define a rectangle whose properties are immutable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly)
 */
open external class DOMRectReadOnly(
    /**
     * The **`x`** read-only property of the **`DOMRectReadOnly`** interface represents the x coordinate of the `DOMRect`'s origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/x)
     */
    open val x: Double = definedExternally,
    /**
     * The **`y`** read-only property of the **`DOMRectReadOnly`** interface represents the y coordinate of the `DOMRect`'s origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/y)
     */
    open val y: Double = definedExternally,
    /**
     * The **`width`** read-only property of the **`DOMRectReadOnly`** interface represents the width of the `DOMRect`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/width)
     */
    open val width: Double = definedExternally,
    /**
     * The **`height`** read-only property of the **`DOMRectReadOnly`** interface represents the height of the `DOMRect`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/height)
     */
    open val height: Double = definedExternally,
) : Serializable {
    /**
     * The **`bottom`** read-only property of the **`DOMRectReadOnly`** interface returns the bottom coordinate value of the `DOMRect`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/bottom)
     */
    open val bottom: Double

    /**
     * The **`left`** read-only property of the **`DOMRectReadOnly`** interface returns the left coordinate value of the `DOMRect`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/left)
     */
    open val left: Double

    /**
     * The **`right`** read-only property of the **`DOMRectReadOnly`** interface returns the right coordinate value of the `DOMRect`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/right)
     */
    open val right: Double

    /**
     * The **`top`** read-only property of the **`DOMRectReadOnly`** interface returns the top coordinate value of the `DOMRect`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/top)
     */
    open val top: Double

    /**
     * The DOMRectReadOnly method `toJSON()` returns a JSON representation of the `DOMRectReadOnly` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * The **`fromRect()`** static method of the DOMRectReadOnly object creates a new `DOMRectReadOnly` object with a given location and dimensions.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/fromRect_static)
         */
        fun fromRect(other: DOMRectReadOnly = definedExternally): DOMRectReadOnly
    }
}
