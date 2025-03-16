// Automatically generated - do not modify!

package web.codecs

import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface VideoEncoderConfig {
    val alpha: AlphaOption?
    val avc: AvcEncoderConfig?
    val bitrate: UInt53?
    val bitrateMode: VideoEncoderBitrateMode?
    val codec: String
    val contentHint: String?
    val displayHeight: Int?
    val displayWidth: Int?
    val framerate: Double?
    val hardwareAcceleration: HardwareAcceleration?
    val height: Int
    val latencyMode: LatencyMode?
    val scalabilityMode: String?
    val width: Int
}
