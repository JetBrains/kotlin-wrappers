// Automatically generated - do not modify!

package web.images

import js.serialization.Serializable
import js.serialization.Transferable
import web.canvas.CanvasImageSource
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource

/**
 * The **`ImageBitmap`** interface represents a bitmap image which can be drawn to a canvas without undue latency.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap)
 */
open external class ImageBitmap
private constructor() :
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable,
    Serializable {
    /**
     * The **`ImageBitmap.height`** read-only property returns the ImageBitmap object's height in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/height)
     */
    val height: Int

    /**
     * The **`ImageBitmap.width`** read-only property returns the ImageBitmap object's width in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/width)
     */
    val width: Int

    /**
     * The **`ImageBitmap.close()`** method disposes of all graphical resources associated with an `ImageBitmap`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/close)
     */
    fun close()
}
