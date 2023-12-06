// Automatically generated - do not modify!

package web.canvas

import js.core.Transferable
import web.gl.TexImageSource

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap) */
sealed external class ImageBitmap :
    CanvasImageSource,
    TexImageSource,
    Transferable {
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
