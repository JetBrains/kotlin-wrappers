// Automatically generated - do not modify!

package web.media.capabilities

import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface VideoConfiguration {
    var bitrate: JsLong
    var colorGamut: ColorGamut?
    var contentType: String
    var framerate: Double
    var hdrMetadataType: HdrMetadataType?
    var height: Int
    var scalabilityMode: String?
    var transferFunction: TransferFunction?
    var width: Int
}
