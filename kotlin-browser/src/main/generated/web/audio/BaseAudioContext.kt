// Automatically generated - do not modify!

package web.audio

import kotlinx.js.ArrayBuffer
import kotlinx.js.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class BaseAudioContext :
    EventTarget {
    /** Available only in secure contexts. */
    val audioWorklet: AudioWorklet
    val currentTime: Double
    val destination: AudioDestinationNode
    val listener: AudioListener
    var onstatechange: EventHandler<Event>?
    val sampleRate: Int
    val state: AudioContextState
    fun createAnalyser(): AnalyserNode
    fun createBiquadFilter(): BiquadFilterNode
    fun createBuffer(
        numberOfChannels: Number,
        length: Number,
        sampleRate: Number,
    ): AudioBuffer

    fun createBufferSource(): AudioBufferSourceNode
    fun createChannelMerger(numberOfInputs: Number = definedExternally): ChannelMergerNode
    fun createChannelSplitter(numberOfOutputs: Number = definedExternally): ChannelSplitterNode
    fun createConstantSource(): ConstantSourceNode
    fun createConvolver(): ConvolverNode
    fun createDelay(maxDelayTime: Number = definedExternally): DelayNode
    fun createDynamicsCompressor(): DynamicsCompressorNode
    fun createGain(): GainNode
    fun createIIRFilter(
        feedforward: ReadonlyArray<Double>,
        feedback: ReadonlyArray<Double>,
    ): IIRFilterNode

    fun createOscillator(): OscillatorNode
    fun createPanner(): PannerNode
    fun createPeriodicWave(
        real: ReadonlyArray<Double>, /* | Float32Array */
        imag: ReadonlyArray<Double>, /* | Float32Array */
        constraints: PeriodicWaveConstraints = definedExternally,
    ): PeriodicWave

    fun createStereoPanner(): StereoPannerNode
    fun createWaveShaper(): WaveShaperNode
    fun decodeAudioData(
        audioData: ArrayBuffer,
        successCallback: DecodeSuccessCallback? = definedExternally,
        errorCallback: DecodeErrorCallback? = definedExternally,
    ): Promise<AudioBuffer>
}
