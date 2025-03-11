// Automatically generated - do not modify!

package web.geometry

import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint)
 */
open external class DOMPoint(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/x)
     */
    override var x: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/y)
     */
    override var y: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/z)
     */
    override var z: Double = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/w)
     */
    override var w: Double = definedExternally,
) : DOMPointReadOnly {
    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/fromPoint_static)
         */
        fun fromPoint(other: DOMPointReadOnly = definedExternally): DOMPoint
    }
}
