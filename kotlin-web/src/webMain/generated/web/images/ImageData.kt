// Automatically generated - do not modify!

package web.images

import js.serialization.Serializable
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import kotlin.js.definedExternally

/**
 * The **`ImageData`** interface represents the underlying pixel data of an area of a <canvas> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData)
 */
open external class ImageData(
    sw: Int,
    sh: Int,
    settings: ImageDataSettings = definedExternally,
) : ImageBitmapSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Serializable {
    constructor(
        data: ImageDataArray,
        sw: Int,
        sh: Int = definedExternally,
        settings: ImageDataSettings = definedExternally,
    )

    /**
     * The read-only **`ImageData.colorSpace`** property is a string indicating the color space of the image data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace)
     */
    val colorSpace: PredefinedColorSpace

    /**
     * The readonly **`ImageData.data`** property returns a Uint8ClampedArray or Float16Array that contains the ImageData object's pixel data. Data is stored as a one-dimensional array in the RGBA order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/data)
     */
    val data: ImageDataArray

    /**
     * The readonly **`ImageData.height`** property returns the number of rows in the ImageData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/height)
     */
    val height: Int

    /**
     * The readonly **`ImageData.width`** property returns the number of pixels per row in the ImageData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/width)
     */
    val width: Int
}
