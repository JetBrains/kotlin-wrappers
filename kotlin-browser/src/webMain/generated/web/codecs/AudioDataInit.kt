// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.Int53
import js.objects.JsPlainObject

@JsPlainObject
external interface AudioDataInit {
    var data: BufferSource
    var format: AudioSampleFormat
    var numberOfChannels: Int
    var numberOfFrames: Int
    var sampleRate: Float
    var timestamp: Int53
    var transfer: ReadonlyArray<ArrayBuffer>?
}
