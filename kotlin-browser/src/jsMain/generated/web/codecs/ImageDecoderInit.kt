// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import kotlinx.js.JsPlainObject
import web.images.ColorSpaceConversion

@JsPlainObject
external interface ImageDecoderInit {
    val colorSpaceConversion: ColorSpaceConversion?
    val data: ImageBufferSource
    val desiredHeight: Int?
    val desiredWidth: Int?
    val preferAnimation: Boolean?
    val transfer: ReadonlyArray<ArrayBuffer>?
    val type: String
}
