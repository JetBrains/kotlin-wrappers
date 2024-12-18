// Automatically generated - do not modify!

package web.images

import js.transferable.Transferable
import web.canvas.CanvasImageSource
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap)
 */
external class ImageBitmap
private constructor() :
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable {
    /**
     * Returns the intrinsic height of the image, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/height)
     */
    val height: UInt

    /**
     * Returns the intrinsic width of the image, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/width)
     */
    val width: UInt

    /**
     * Releases imageBitmap's underlying bitmap data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/close)
     */
    fun close()
}
