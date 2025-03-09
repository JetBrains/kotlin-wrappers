// Automatically generated - do not modify!

package web.canvas

import web.images.ImageData
import web.images.ImageDataSettings

sealed external interface CanvasImageData {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData)
     */
    fun createImageData(
        sw: Int,
        sh: Int,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    fun createImageData(imageData: ImageData): ImageData

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
        imageData: ImageData,
        dx: Int,
        dy: Int,
    )

    fun putImageData(
        imageData: ImageData,
        dx: Int,
        dy: Int,
        dirtyX: Int,
        dirtyY: Int,
        dirtyWidth: Int,
        dirtyHeight: Int,
    )
}
