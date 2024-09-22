// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface VideoEncoderConfig {
    var alpha: AlphaOption?
    var avc: AvcEncoderConfig?
    var bitrate: JsLong?
    var bitrateMode: VideoEncoderBitrateMode?
    var codec: String
    var contentHint: String?
    var displayHeight: Int?
    var displayWidth: Int?
    var framerate: Double?
    var hardwareAcceleration: HardwareAcceleration?
    var height: Int
    var latencyMode: LatencyMode?
    var scalabilityMode: String?
    var width: Int
}
