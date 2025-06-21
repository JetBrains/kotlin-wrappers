// Automatically generated - do not modify!

package web.codecs

import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface AudioEncoderConfig {
    var bitrate: UInt53?
    var bitrateMode: BitrateMode?
    var codec: String
    var numberOfChannels: Int
    var opus: OpusEncoderConfig?
    var sampleRate: Int
}
