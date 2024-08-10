// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import web.images.ImageData

/**
 * Extract a pixel array from a loaded image.  Draws the image
 * into a canvas so it can read the pixels back.
 * @param [image] The image to extract pixels from.
 * @param [width] The width of the image. If not defined, then image.width is assigned.
 * @param [height] The height of the image. If not defined, then image.height is assigned.
 * @return The pixels of the image.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#getImagePixels">Online Documentation</a>
 */
external fun getImagePixels(
    image: Any, /* HTMLImageElement | ImageBitmap */
    width: Double,
    height: Double,
): ImageData
