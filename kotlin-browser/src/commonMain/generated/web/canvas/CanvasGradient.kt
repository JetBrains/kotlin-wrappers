// Automatically generated - do not modify!

package web.canvas

/**
 * The **`CanvasGradient`** interface represents an opaque object describing a gradient.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasGradient)
 */
external class CanvasGradient
private constructor() {
    /**
     * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
     *
     * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasGradient/addColorStop)
     */
    fun addColorStop(
        offset: Double,
        color: String,
    )
}
