// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBuffer
import js.numbers.Int53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface EncodedAudioChunkInit {
    var data: AllowSharedBufferSource
    var duration: UInt53?
    var timestamp: Int53
    var transfer: ReadonlyArray<ArrayBuffer>?
    var type: EncodedAudioChunkType
}
