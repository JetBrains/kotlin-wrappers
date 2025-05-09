// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.serialization.Serializable
import js.transferable.Transferable

/**
 * The **`AudioData`** interface of the WebCodecs API represents an audio sample.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData)
 */
open external class AudioData(
    init: AudioDataInit,
) : Transferable,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/duration)
     */
    val duration: UInt53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format)
     */
    val format: AudioSampleFormat?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfChannels)
     */
    val numberOfChannels: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfFrames)
     */
    val numberOfFrames: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/sampleRate)
     */
    val sampleRate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/timestamp)
     */
    val timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/allocationSize)
     */
    fun allocationSize(options: AudioDataCopyToOptions): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/clone)
     */
    fun clone(): AudioData

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/copyTo)
     */
    fun copyTo(
        destination: AllowSharedBufferSource,
        options: AudioDataCopyToOptions,
    )
}
