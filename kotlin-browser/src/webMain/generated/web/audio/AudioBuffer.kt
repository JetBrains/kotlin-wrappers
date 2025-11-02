// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.typedarrays.Float32Array
import kotlin.js.definedExternally

/**
 * The **`AudioBuffer`** interface represents a short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer)
 */
open external class AudioBuffer(
    options: AudioBufferOptions,
) {
    /**
     * The **`duration`** property of the AudioBuffer interface returns a double representing the duration, in seconds, of the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/duration)
     */
    val duration: Double

    /**
     * The **`length`** property of the AudioBuffer interface returns an integer representing the length, in sample-frames, of the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/length)
     */
    val length: Int

    /**
     * The **`numberOfChannels`** property of the AudioBuffer interface returns an integer representing the number of discrete audio channels described by the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/numberOfChannels)
     */
    val numberOfChannels: Int

    /**
     * The **`sampleRate`** property of the AudioBuffer interface returns a float representing the sample rate, in samples per second, of the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/sampleRate)
     */
    val sampleRate: Float

    /**
     * The **`copyFromChannel()`** method of the AudioBuffer interface copies the audio sample data from the specified channel of the AudioBuffer to a specified Float32Array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyFromChannel)
     */
    fun copyFromChannel(
        destination: Float32Array<ArrayBuffer>,
        channelNumber: Int,
        bufferOffset: Int = definedExternally,
    )

    /**
     * The **`copyToChannel()`** method of the AudioBuffer interface copies the samples to the specified channel of the AudioBuffer, from the source array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyToChannel)
     */
    fun copyToChannel(
        source: Float32Array<ArrayBuffer>,
        channelNumber: Int,
        bufferOffset: Int = definedExternally,
    )

    /**
     * The **`getChannelData()`** method of the AudioBuffer Interface returns a Float32Array containing the PCM data associated with the channel, defined by the channel parameter (with 0 representing the first channel).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/getChannelData)
     */
    fun getChannelData(channel: Int): Float32Array<ArrayBuffer>
}
