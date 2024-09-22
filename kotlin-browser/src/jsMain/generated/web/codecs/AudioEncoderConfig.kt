// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioEncoderConfig {
    var bitrate: JsLong?
    var bitrateMode: BitrateMode?
    var codec: String
    var numberOfChannels: Int
    var opus: OpusEncoderConfig?
    var sampleRate: Int
}
