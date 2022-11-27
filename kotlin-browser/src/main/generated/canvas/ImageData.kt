// Automatically generated - do not modify!

package canvas

import js.typedarrays.Uint8ClampedArray

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

    val colorSpace: PredefinedColorSpace

    /** Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255. */
    val data: Uint8ClampedArray

    /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
    val height: Int

    /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
    val width: Int
}
