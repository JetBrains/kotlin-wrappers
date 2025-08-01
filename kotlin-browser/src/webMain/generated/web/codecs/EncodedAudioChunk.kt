// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.serialization.Serializable

/**
 * The **`EncodedAudioChunk`** interface of the WebCodecs API represents a chunk of encoded audio data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk)
 */
open external class EncodedAudioChunk(
    init: EncodedAudioChunkInit,
) : Serializable {
    /**
     * The **`byteLength`** read-only property of the EncodedAudioChunk interface returns the length in bytes of the encoded audio data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/byteLength)
     */
    val byteLength: Int

    /**
     * The **`duration`** read-only property of the EncodedAudioChunk interface returns an integer indicating the duration of the audio in microseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/duration)
     */
    val duration: UInt53?

    /**
     * The **`timestamp`** read-only property of the EncodedAudioChunk interface returns an integer indicating the timestamp of the audio in microseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/timestamp)
     */
    val timestamp: Int53

    /**
     * The **`type`** read-only property of the EncodedAudioChunk interface returns a value indicating whether the audio chunk is a key chunk, which does not relying on other frames for decoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type)
     */
    val type: EncodedAudioChunkType

    /**
     * The **`copyTo()`** method of the EncodedAudioChunk interface copies the encoded chunk of audio data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/copyTo)
     */
    fun copyTo(destination: AllowSharedBufferSource)
}
