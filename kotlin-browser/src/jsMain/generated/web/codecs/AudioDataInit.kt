// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioDataInit {
    var data: BufferSource
    var format: AudioSampleFormat
    var numberOfChannels: Int
    var numberOfFrames: Int
    var sampleRate: Float
    var timestamp: JsLong
    var transfer: ReadonlyArray<ArrayBuffer>?
}
