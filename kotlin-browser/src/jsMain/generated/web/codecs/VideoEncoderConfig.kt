// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
external interface VideoEncoderConfig {
    val alpha: AlphaOption?
    val avc: AvcEncoderConfig?
    val bitrate: JsLong?
    val bitrateMode: VideoEncoderBitrateMode?
    val codec: String
    val contentHint: String?
    val displayHeight: UInt?
    val displayWidth: UInt?
    val framerate: Double?
    val hardwareAcceleration: HardwareAcceleration?
    val height: UInt
    val latencyMode: LatencyMode?
    val scalabilityMode: String?
    val width: UInt
}
