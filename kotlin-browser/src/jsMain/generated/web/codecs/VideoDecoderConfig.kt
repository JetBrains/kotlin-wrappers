// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.objects.JsPlainObject

@JsPlainObject
external interface VideoDecoderConfig {
    val codec: String
    val codedHeight: UInt?
    val codedWidth: UInt?
    val colorSpace: VideoColorSpaceInit?
    val description: AllowSharedBufferSource?
    val displayAspectHeight: UInt?
    val displayAspectWidth: UInt?
    val hardwareAcceleration: HardwareAcceleration?
    val optimizeForLatency: Boolean?
}
