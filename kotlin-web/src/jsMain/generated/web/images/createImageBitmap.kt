// Automatically generated - do not modify!

package web.images

import js.promise.Promise
import seskar.js.JsAsync

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/createImageBitmap)
 */
@JsAsync
external suspend fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions? = definedExternally,
): ImageBitmap

@JsName("createImageBitmap")
external fun createImageBitmapAsync(
    image: ImageBitmapSource,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

@JsAsync
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
