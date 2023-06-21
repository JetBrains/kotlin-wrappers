// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasText {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillText) */
    fun fillText(
        text: String,
        x: Number,
        y: Number,
        maxWidth: Number = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/measureText) */
    fun measureText(text: String): TextMetrics

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeText) */
    fun strokeText(
        text: String,
        x: Number,
        y: Number,
        maxWidth: Number = definedExternally,
    )
}
