// Automatically generated - do not modify!

package web.codecs

sealed external interface VideoEncoderConfig {
    var alpha: AlphaOption?
    var avc: AvcEncoderConfig?
    var bitrate: Int?
    var bitrateMode: VideoEncoderBitrateMode?
    var codec: String
    var displayHeight: Int?
    var displayWidth: Int?
    var framerate: Double?
    var hardwareAcceleration: HardwareAcceleration?
    var height: Double
    var latencyMode: LatencyMode?
    var scalabilityMode: String?
    var width: Double
}
