// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import kotlinx.js.JsPlainObject
import web.images.ColorSpaceConversion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#init)
 */
@JsPlainObject
external interface ImageDecoderInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#colorspaceconversion)
     */
    var colorSpaceConversion: ColorSpaceConversion?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#data)
     */
    var data: ImageBufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#desiredheight)
     */
    var desiredHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#desiredwidth)
     */
    var desiredWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#preferanimation)
     */
    var preferAnimation: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#transfer)
     */
    var transfer: ReadonlyArray<ArrayBuffer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/ImageDecoder#type)
     */
    var type: String
}
