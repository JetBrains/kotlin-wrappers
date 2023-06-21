// Automatically generated - do not modify!

package web.codecs

import js.buffer.BufferSource
import js.core.JsLong

external class EncodedVideoChunk(
    init: EncodedVideoChunkInit,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/byteLength) */
    val byteLength: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/duration) */
    val duration: Double?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/timestamp) */
    val timestamp: JsLong

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type) */
    val type: EncodedVideoChunkType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/copyTo) */
    fun copyTo(destination: BufferSource)
}
