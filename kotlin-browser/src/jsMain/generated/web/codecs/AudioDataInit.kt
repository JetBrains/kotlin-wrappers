// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
external interface AudioDataInit {
    val data: BufferSource
    val format: AudioSampleFormat
    val numberOfChannels: UInt
    val numberOfFrames: UInt
    val sampleRate: Float
    val timestamp: JsLong
    val transfer: ReadonlyArray<ArrayBuffer>?
}
