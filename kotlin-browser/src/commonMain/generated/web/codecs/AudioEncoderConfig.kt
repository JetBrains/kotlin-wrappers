// Automatically generated - do not modify!

package web.codecs

import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface AudioEncoderConfig {
    val bitrate: UInt53?
    val bitrateMode: BitrateMode?
    val codec: String
    val numberOfChannels: Int
    val opus: OpusEncoderConfig?
    val sampleRate: Int
}
