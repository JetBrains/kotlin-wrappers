// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import web.images.ImageData
import web.images.ImageDataSettings
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasImageData {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData)
     */
    fun createImageData(
        sw: Int,
        sh: Int,
        settings: ImageDataSettings = definedExternally,
    ): ImageData = definedExternally

    fun createImageData(imageData: ImageData): ImageData = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData)
     */
    fun getImageData(
        sx: Int,
        sy: Int,
        sw: Int,
        sh: Int,
        settings: ImageDataSettings = definedExternally,
    ): ImageData = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData)
     */
    fun putImageData(
        imageData: ImageData,
        dx: Int,
        dy: Int,
    ): Unit = definedExternally

    fun putImageData(
        imageData: ImageData,
        dx: Int,
        dy: Int,
        dirtyX: Int,
        dirtyY: Int,
        dirtyWidth: Int,
        dirtyHeight: Int,
    ): Unit = definedExternally
}
