// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import kotlinx.js.JsPlainObject
import web.images.ColorSpaceConversion

@JsPlainObject
external interface ImageDecoderInit {
    var colorSpaceConversion: ColorSpaceConversion?
    var data: ImageBufferSource
    var desiredHeight: Int?
    var desiredWidth: Int?
    var preferAnimation: Boolean?
    var transfer: ReadonlyArray<ArrayBuffer>?
    var type: String
}
