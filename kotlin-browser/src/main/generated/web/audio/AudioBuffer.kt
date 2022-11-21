// Automatically generated - do not modify!

package web.audio

import kotlinx.js.Float32Array

external class AudioBuffer(
    options: AudioBufferOptions,
) {
    val duration: Double
    val length: Int
    val numberOfChannels: Int
    val sampleRate: Int
    fun copyFromChannel(
        destination: Float32Array,
        channelNumber: Number,
        bufferOffset: Number = definedExternally,
    )

    fun copyToChannel(
        source: Float32Array,
        channelNumber: Number,
        bufferOffset: Number = definedExternally,
    )

    fun getChannelData(channel: Number): Float32Array
}
