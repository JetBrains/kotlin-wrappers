// Automatically generated - do not modify!

package web.audio

import js.typedarrays.Float32Array

/**
 * A short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer)
 */
open external class AudioBuffer(
    options: AudioBufferOptions,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/duration)
     */
    val duration: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/length)
     */
    val length: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/numberOfChannels)
     */
    val numberOfChannels: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/sampleRate)
     */
    val sampleRate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyFromChannel)
     */
    fun copyFromChannel(
        destination: Float32Array<*>,
        channelNumber: UInt,
        bufferOffset: UInt = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyToChannel)
     */
    fun copyToChannel(
        source: Float32Array<*>,
        channelNumber: UInt,
        bufferOffset: UInt = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/getChannelData)
     */
    fun getChannelData(channel: UInt): Float32Array<*>
}
