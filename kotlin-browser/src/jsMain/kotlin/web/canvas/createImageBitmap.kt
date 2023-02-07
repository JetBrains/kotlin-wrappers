package web.canvas

import kotlin.js.Promise

external fun createImageBitmap(
    image: ImageBitmapSource,
    options: ImageBitmapOptions = definedExternally,
): Promise<ImageBitmap>

external fun createImageBitmap(
    image: ImageBitmapSource,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    options: ImageBitmapOptions = definedExternally,
): Promise<ImageBitmap>
