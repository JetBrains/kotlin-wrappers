// Automatically generated - do not modify!

package web.geometry

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect)
 */
open external class DOMRect(
    x: Double = definedExternally,
    y: Double = definedExternally,
    width: Double = definedExternally,
    height: Double = definedExternally,
) : DOMRectReadOnly {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/height)
     */
    override var height: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/width)
     */
    override var width: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/x)
     */
    override var x: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/y)
     */
    override var y: Double

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/fromRect_static)
         */
        fun fromRect(other: DOMRectInit = definedExternally): DOMRect
        fun fromRect(other: DOMRectReadOnly /* DOMRectInit */): DOMRect
    }
}
