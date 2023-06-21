// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasImageData {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData) */
    fun createImageData(
        sw: Number,
        sh: Number,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    fun createImageData(imagedata: ImageData): ImageData

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData) */
    fun getImageData(
        sx: Number,
        sy: Number,
        sw: Number,
        sh: Number,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData) */
    fun putImageData(
        imagedata: ImageData,
        dx: Number,
        dy: Number,
    )

    fun putImageData(
        imagedata: ImageData,
        dx: Number,
        dy: Number,
        dirtyX: Number,
        dirtyY: Number,
        dirtyWidth: Number,
        dirtyHeight: Number,
    )
}
