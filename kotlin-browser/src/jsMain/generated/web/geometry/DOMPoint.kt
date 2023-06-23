// Automatically generated - do not modify!

package web.geometry

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint) */
external class DOMPoint(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally,
) : DOMPointReadOnly {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/w) */
    override var w: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/x) */
    override var x: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/y) */
    override var y: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/z) */
    override var z: Double

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/fromPoint_static) */
        fun fromPoint(other: DOMPointInit = definedExternally): DOMPoint
        fun fromPoint(other: DOMPointReadOnly /* DOMPointInit */): DOMPoint
    }
}
