// Automatically generated - do not modify!

package web.geometry

import js.core.JsAny
import js.serializable.Serializable
import kotlin.js.definedExternally

/**
 * The **`DOMRectReadOnly`** interface specifies the standard properties (also used by DOMRect) to define a rectangle whose properties are immutable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly)
 */
open external class DOMRectReadOnly(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/x)
     */
    open val x: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/y)
     */
    open val y: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/width)
     */
    open val width: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/height)
     */
    open val height: Double = definedExternally,
) : Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/bottom)
     */
    open val bottom: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/left)
     */
    open val left: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/right)
     */
    open val right: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/top)
     */
    open val top: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/toJSON)
     */
    fun toJSON(): JsAny

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/fromRect_static)
         */
        fun fromRect(other: DOMRectReadOnly = definedExternally): DOMRectReadOnly
    }
}
