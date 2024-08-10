// Automatically generated - do not modify!

package web.geometry

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect)
 */
external class DOMRect(
    x: Double = definedExternally,
    y: Double = definedExternally,
    width: Double = definedExternally,
    height: Double = definedExternally,
) : DOMRectReadOnly {
    override var height: Double
    override var width: Double
    override var x: Double
    override var y: Double

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/fromRect_static)
         */
        fun fromRect(other: DOMRectInit = definedExternally): DOMRect
        fun fromRect(other: DOMRectReadOnly /* DOMRectInit */): DOMRect
    }
}
