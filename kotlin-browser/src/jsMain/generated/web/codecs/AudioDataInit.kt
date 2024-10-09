// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AudioDataInit {
    val data: BufferSource
    val format: AudioSampleFormat
    val numberOfChannels: Int
    val numberOfFrames: Int
    val sampleRate: Float
    val timestamp: JsLong
    val transfer: ReadonlyArray<ArrayBuffer>?
}
