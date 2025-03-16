// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBuffer
import js.core.Int53
import js.objects.JsPlainObject

@JsPlainObject
external interface EncodedAudioChunkInit {
    val data: AllowSharedBufferSource
    val duration: Int53?
    val timestamp: Int53
    val transfer: ReadonlyArray<ArrayBuffer>?
    val type: EncodedAudioChunkType
}
