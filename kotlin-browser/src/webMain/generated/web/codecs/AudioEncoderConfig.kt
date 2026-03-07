// Automatically generated - do not modify!

package web.codecs

import js.numbers.UInt53
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioEncoderConfig {
    var aac: AacEncoderConfig?
    var bitrate: UInt53?
    var bitrateMode: BitrateMode?
    var codec: String
    var numberOfChannels: Int
    var opus: OpusEncoderConfig?
    var sampleRate: Int
}
