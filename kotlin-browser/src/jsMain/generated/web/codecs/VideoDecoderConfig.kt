// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource

sealed external interface VideoDecoderConfig {
    var codec: String
    var codedHeight: Int?
    var codedWidth: Int?
    var colorSpace: VideoColorSpaceInit?
    var description: AllowSharedBufferSource?
    var displayAspectHeight: Int?
    var displayAspectWidth: Int?
    var hardwareAcceleration: HardwareAcceleration?
    var optimizeForLatency: Boolean?
}
