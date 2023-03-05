// Automatically generated - do not modify!

package web.codecs

import js.buffer.BufferSource
import js.core.JsLong

external class EncodedVideoChunk(
    init: EncodedVideoChunkInit,
) {
    val byteLength: Int
    val duration: Double?
    val timestamp: JsLong
    val type: EncodedVideoChunkType
    fun copyTo(destination: BufferSource)
}
