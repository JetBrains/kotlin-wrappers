// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBuffer
import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface EncodedAudioChunkInit {
    var data: AllowSharedBufferSource
    var duration: JsLong?
    var timestamp: JsLong
    var transfer: ReadonlyArray<ArrayBuffer>?
    var type: EncodedAudioChunkType
}
