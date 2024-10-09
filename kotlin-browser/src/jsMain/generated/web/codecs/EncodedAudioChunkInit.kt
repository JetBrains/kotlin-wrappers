// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBuffer
import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface EncodedAudioChunkInit {
    val data: AllowSharedBufferSource
    val duration: JsLong?
    val timestamp: JsLong
    val transfer: ReadonlyArray<ArrayBuffer>?
    val type: EncodedAudioChunkType
}
