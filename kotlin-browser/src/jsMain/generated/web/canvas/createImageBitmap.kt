// Automatically generated - do not modify!

package web.canvas

import js.promise.Promise
import web.buffer.Blob

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/createImageBitmap)
 */
external fun createImageBitmap(
    image: CanvasImageSource,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: Blob,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: ImageData,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: CanvasImageSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: Blob,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: ImageData,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>
