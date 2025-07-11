// Automatically generated - do not modify!

package web.images

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/createImageBitmap)
 */
@JsName("createImageBitmap")
external fun createImageBitmapAsync(
    image: ImageBitmapSource,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions?,
): ImageBitmap {
    return createImageBitmapAsync(
        image = image,
        options = options
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun createImageBitmap(
    image: ImageBitmapSource,
): ImageBitmap {
    return createImageBitmapAsync(image = image).await()
}

@JsName("createImageBitmap")
external fun createImageBitmapAsync(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions? = definedExternally,
): Promise<ImageBitmap>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions?,
): ImageBitmap {
    return createImageBitmapAsync(
        image = image,
        sx = sx,
        sy = sy,
        sw = sw,
        sh = sh,
        options = options
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
): ImageBitmap {
    return createImageBitmapAsync(
        image = image,
        sx = sx,
        sy = sy,
        sw = sw,
        sh = sh
    ).await()
}
