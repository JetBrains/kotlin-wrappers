// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface VideoEncoderConfig {
    var alpha: AlphaOption?
    var avc: AvcEncoderConfig?
    var bitrate: JsLong?
    var bitrateMode: VideoEncoderBitrateMode?
    var codec: String
    var displayHeight: Int?
    var displayWidth: Int?
    var framerate: Double?
    var hardwareAcceleration: HardwareAcceleration?
    var height: Int
    var latencyMode: LatencyMode?
    var scalabilityMode: String?
    var width: Int
}
