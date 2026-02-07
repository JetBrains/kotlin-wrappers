// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface EncodedVideoChunkInit {
    var data: AllowSharedBufferSource
    var duration: UInt53?
    var timestamp: Int53
    var type: EncodedVideoChunkType
}
