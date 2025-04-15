// Automatically generated - do not modify!

package web.images

import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import kotlin.js.definedExternally

/**
 * The underlying pixel data of an area of a <canvas> element. It is created using the ImageData() constructor or creator methods on the CanvasRenderingContext2D object associated with a canvas: createImageData() and getImageData(). It can also be used to set a part of the canvas by using putImageData().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData)
 */
open external class ImageData(
    sw: Int,
    sh: Int,
    settings: ImageDataSettings = definedExternally,
) : ImageBitmapSource,
    TexImageSource,
    GPUCopyExternalImageSource {
    constructor(
        data: ImageDataArray,
        sw: Int,
        sh: Int = definedExternally,
        settings: ImageDataSettings = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace)
     */
    val colorSpace: PredefinedColorSpace

    /**
     * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/data)
     */
    val data: ImageDataArray

    /**
     * Returns the actual dimensions of the data in the ImageData object, in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/height)
     */
    val height: Int

    /**
     * Returns the actual dimensions of the data in the ImageData object, in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/width)
     */
    val width: Int
}
