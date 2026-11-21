// Automatically generated - do not modify!

package web.canvas

import js.internal.InternalApi
import web.errors.DOMExceptionType.*
import web.errors.JsThrows
import web.images.ImageData
import web.images.ImageDataSettings

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasImageData {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData)
     */
    @JsThrows(IndexSizeError::class)
    fun createImageData(
        sw: Int,
        sh: Int,
        settings: ImageDataSettings = definedExternally,
    ): ImageData

    @JsThrows(IndexSizeError::class)
    fun createImageData(imageData: ImageData): ImageData

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData)
     */
    @JsThrows(IndexSizeError::class)
    @JsThrows(SecurityError::class)
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
    @JsThrows(InvalidStateError::class)
    @JsThrows(NotSupportedError::class)
    fun putImageData(
        imageData: ImageData,
        dx: Int,
        dy: Int,
    )

    @JsThrows(InvalidStateError::class)
    @JsThrows(NotSupportedError::class)
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
