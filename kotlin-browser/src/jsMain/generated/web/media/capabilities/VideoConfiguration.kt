// Automatically generated - do not modify!

package web.media.capabilities

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface VideoConfiguration {
    val bitrate: JsLong
    val colorGamut: ColorGamut?
    val contentType: String
    val framerate: Double
    val hasAlphaChannel: Boolean?
    val hdrMetadataType: HdrMetadataType?
    val height: Int
    val scalabilityMode: String?
    val transferFunction: TransferFunction?
    val width: Int
}
