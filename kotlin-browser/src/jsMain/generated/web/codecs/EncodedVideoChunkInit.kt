// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
external interface EncodedVideoChunkInit {
    val data: AllowSharedBufferSource
    val duration: JsLong?
    val timestamp: JsLong
    val type: EncodedVideoChunkType
}
