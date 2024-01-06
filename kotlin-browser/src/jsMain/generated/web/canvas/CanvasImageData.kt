// Automatically generated - do not modify!

package web.canvas

sealed external interface CanvasImageData {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData)
     */
    fun createImageData(
        sw: Int,
        sh: Int,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    fun createImageData(imagedata: ImageData): ImageData

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData)
     */
    fun getImageData(
        sx: Int,
        sy: Int,
        sw: Int,
        sh: Int,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData)
     */
    fun putImageData(
        imagedata: ImageData,
        dx: Int,
        dy: Int,
    )

    fun putImageData(
        imagedata: ImageData,
        dx: Int,
        dy: Int,
        dirtyX: Int,
        dirtyY: Int,
        dirtyWidth: Int,
        dirtyHeight: Int,
    )
}
