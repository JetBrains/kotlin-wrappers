// Automatically generated - do not modify!

package web.images

import js.serialization.Serializable
import js.transferable.Transferable
import web.canvas.CanvasImageSource
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource

/**
 * The **`ImageBitmap`** interface represents a bitmap image which can be drawn to a canvas without undue latency.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap)
 */
external class ImageBitmap
private constructor() :
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable,
    Serializable {
    /**
     * Returns the intrinsic height of the image, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/height)
     */
    val height: Int

    /**
     * Returns the intrinsic width of the image, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/width)
     */
    val width: Int

    /**
     * Releases imageBitmap's underlying bitmap data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/close)
     */
    fun close()
}
