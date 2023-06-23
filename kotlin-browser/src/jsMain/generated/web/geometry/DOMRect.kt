// Automatically generated - do not modify!

package web.geometry

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect) */
external class DOMRect(
    x: Number = definedExternally,
    y: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
) : DOMRectReadOnly {
    override var height: Double
    override var width: Double
    override var x: Double
    override var y: Double

    companion object {
        fun fromRect(other: DOMRectInit = definedExternally): DOMRect
        fun fromRect(other: DOMRectReadOnly /* DOMRectInit */): DOMRect
    }
}
