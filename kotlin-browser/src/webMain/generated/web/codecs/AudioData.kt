// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.closeable.JsCloseable
import js.core.Int53
import js.core.UInt53
import js.serialization.Serializable
import js.serialization.Transferable

/**
 * The **`AudioData`** interface of the WebCodecs API represents an audio sample.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData)
 */
open external class AudioData(
    init: AudioDataInit,
) : Transferable,
    Serializable,
    JsCloseable {
    /**
     * The **`duration`** read-only property of the AudioData interface returns the duration in microseconds of this `AudioData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/duration)
     */
    val duration: UInt53

    /**
     * The **`format`** read-only property of the AudioData interface returns the sample format of the `AudioData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format)
     */
    val format: AudioSampleFormat?

    /**
     * The **`numberOfChannels`** read-only property of the AudioData interface returns the number of channels in the `AudioData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfChannels)
     */
    val numberOfChannels: Int

    /**
     * The **`numberOfFrames`** read-only property of the AudioData interface returns the number of frames in the `AudioData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfFrames)
     */
    val numberOfFrames: Int

    /**
     * The **`sampleRate`** read-only property of the AudioData interface returns the sample rate in Hz.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/sampleRate)
     */
    val sampleRate: Float

    /**
     * The **`timestamp`** read-only property of the AudioData interface returns the timestamp of this `AudioData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/timestamp)
     */
    val timestamp: Int53

    /**
     * The **`allocationSize()`** method of the AudioData interface returns the size in bytes required to hold the current sample as filtered by options passed into the method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/allocationSize)
     */
    fun allocationSize(options: AudioDataCopyToOptions): Int

    /**
     * The **`clone()`** method of the AudioData interface creates a new `AudioData` object with reference to the same media resource as the original.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/clone)
     */
    fun clone(): AudioData

    /**
     * The **`close()`** method of the AudioData interface clears all states and releases the reference to the media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/close)
     */
    override fun close()

    /**
     * The **`copyTo()`** method of the AudioData interface copies a plane of an `AudioData` object to a destination buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/copyTo)
     */
    fun copyTo(
        destination: AllowSharedBufferSource,
        options: AudioDataCopyToOptions,
    )
}
