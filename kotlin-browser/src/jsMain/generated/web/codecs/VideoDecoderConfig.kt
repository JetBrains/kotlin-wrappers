// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface VideoDecoderConfig {
    val codec: String
    val codedHeight: Int?
    val codedWidth: Int?
    val colorSpace: VideoColorSpaceInit?
    val description: AllowSharedBufferSource?
    val displayAspectHeight: Int?
    val displayAspectWidth: Int?
    val hardwareAcceleration: HardwareAcceleration?
    val optimizeForLatency: Boolean?
}
