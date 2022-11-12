// Automatically generated - do not modify!

package canvas

import dom.html.HTMLCanvasElement

sealed external class ImageBitmapRenderingContext {
    /** Returns the canvas element that the context is bound to. */
    val canvas: HTMLCanvasElement

    /** Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound. */
    fun transferFromImageBitmap(bitmap: ImageBitmap?)
}
