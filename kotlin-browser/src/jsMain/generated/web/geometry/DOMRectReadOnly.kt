// Automatically generated - do not modify!

package web.geometry

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly) */
open external class DOMRectReadOnly(
    x: Number = definedExternally,
    y: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/bottom) */
    open val bottom: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/height) */
    open val height: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/left) */
    open val left: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/right) */
    open val right: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/top) */
    open val top: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/width) */
    open val width: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/x) */
    open val x: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/y) */
    open val y: Double
    fun toJSON(): Any

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/fromRect_static) */
        fun fromRect(other: DOMRectInit = definedExternally): DOMRectReadOnly
        fun fromRect(other: DOMRectReadOnly /* DOMRectInit */): DOMRectReadOnly
    }
}
