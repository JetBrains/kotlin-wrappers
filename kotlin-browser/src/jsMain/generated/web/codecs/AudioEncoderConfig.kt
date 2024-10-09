// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioEncoderConfig {
    val bitrate: JsLong?
    val bitrateMode: BitrateMode?
    val codec: String
    val numberOfChannels: Int
    val opus: OpusEncoderConfig?
    val sampleRate: Int
}
