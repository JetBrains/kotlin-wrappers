// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.Int53
import js.objects.JsPlainObject

@JsPlainObject
external interface AudioDataInit {
    val data: BufferSource
    val format: AudioSampleFormat
    val numberOfChannels: Int
    val numberOfFrames: Int
    val sampleRate: Float
    val timestamp: Int53
    val transfer: ReadonlyArray<ArrayBuffer>?
}
