// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.serialization.Serializable

/**
 * The **`EncodedVideoChunk`** interface of the WebCodecs API represents a chunk of encoded video data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk)
 */
open external class EncodedVideoChunk(
    init: EncodedVideoChunkInit,
) : Serializable {
    /**
     * The **`byteLength`** read-only property of the EncodedVideoChunk interface returns the length in bytes of the encoded video data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/byteLength)
     */
    val byteLength: Int

    /**
     * The **`duration`** read-only property of the EncodedVideoChunk interface returns an integer indicating the duration of the video in microseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/duration)
     */
    val duration: UInt53?

    /**
     * The **`timestamp`** read-only property of the EncodedVideoChunk interface returns an integer indicating the timestamp of the video in microseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/timestamp)
     */
    val timestamp: Int53

    /**
     * The **`type`** read-only property of the EncodedVideoChunk interface returns a value indicating whether the video chunk is a key chunk, which does not rely on other frames for decoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type)
     */
    val type: EncodedVideoChunkType

    /**
     * The **`copyTo()`** method of the EncodedVideoChunk interface copies the encoded chunk of video data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/copyTo)
     */
    fun copyTo(destination: AllowSharedBufferSource)
}
