// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.objects.JsPlainObject

@JsPlainObject
external interface EncodedVideoChunkInit {
    val data: AllowSharedBufferSource
    val duration: Int53?
    val timestamp: Int53
    val type: EncodedVideoChunkType
}
