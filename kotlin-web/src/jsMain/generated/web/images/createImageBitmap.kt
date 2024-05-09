// Automatically generated - do not modify!

package web.images

import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/createImageBitmap)
 */
external suspend fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions? = definedExternally,
): ImageBitmap

@JsName("createImageBitmap")
external fun createImageBitmapAsync(
    image: ImageBitmapSource,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

external suspend fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions? = definedExternally,
): ImageBitmap

@JsName("createImageBitmap")
external fun createImageBitmapAsync(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>
