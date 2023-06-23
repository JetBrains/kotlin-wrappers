// Automatically generated - do not modify!

package web.canvas

import js.typedarrays.Uint8ClampedArray

/**
 * The underlying pixel data of an area of a <canvas> element. It is created using the ImageData() constructor or creator methods on the CanvasRenderingContext2D object associated with a canvas: createImageData() and getImageData(). It can also be used to set a part of the canvas by using putImageData().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData)
 */
external class ImageData(
    sw: Number,
    sh: Number,
    settings: ImageDataSettings = definedExternally,
) {
    constructor(
        data: Uint8ClampedArray,
        sw: Number,
        sh: Number = definedExternally,
        settings: ImageDataSettings = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace) */
    val colorSpace: PredefinedColorSpace

    /**
     * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/data)
     */
    val data: Uint8ClampedArray

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
