// Automatically generated - do not modify!

package canvas

sealed external interface CanvasText {
    fun fillText(
        text: String,
        x: Number,
        y: Number,
        maxWidth: Number = definedExternally,
    )

    fun measureText(text: String): TextMetrics
    fun strokeText(
        text: String,
        x: Number,
        y: Number,
        maxWidth: Number = definedExternally,
    )
}
