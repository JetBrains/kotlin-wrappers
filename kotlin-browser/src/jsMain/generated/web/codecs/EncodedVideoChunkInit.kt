// Automatically generated - do not modify!

package web.codecs

import js.buffer.BufferSource
import js.core.JsLong

sealed external interface EncodedVideoChunkInit {
    var data: BufferSource
    var duration: Double?
    var timestamp: JsLong
    var type: EncodedVideoChunkType
}
