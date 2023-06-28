// Automatically generated - do not modify!

package web.audio

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray
import js.promise.Promise
import js.typedarrays.Float32Array
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext) */
sealed external class BaseAudioContext :
    EventTarget {
    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/audioWorklet)
     */
    val audioWorklet: AudioWorklet

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/currentTime) */
    val currentTime: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/destination) */
    val destination: AudioDestinationNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/listener) */
    val listener: AudioListener

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/statechange_event) */
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/sampleRate) */
    val sampleRate: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state) */
    val state: AudioContextState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createAnalyser) */
    fun createAnalyser(): AnalyserNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBiquadFilter) */
    fun createBiquadFilter(): BiquadFilterNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBuffer) */
    fun createBuffer(
        numberOfChannels: Number,
        length: Number,
        sampleRate: Number,
    ): AudioBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBufferSource) */
    fun createBufferSource(): AudioBufferSourceNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelMerger) */
    fun createChannelMerger(numberOfInputs: Number = definedExternally): ChannelMergerNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelSplitter) */
    fun createChannelSplitter(numberOfOutputs: Number = definedExternally): ChannelSplitterNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConstantSource) */
    fun createConstantSource(): ConstantSourceNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConvolver) */
    fun createConvolver(): ConvolverNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDelay) */
    fun createDelay(maxDelayTime: Number = definedExternally): DelayNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDynamicsCompressor) */
    fun createDynamicsCompressor(): DynamicsCompressorNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createGain) */
    fun createGain(): GainNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createIIRFilter) */
    fun createIIRFilter(
        feedforward: ReadonlyArray<Double>,
        feedback: ReadonlyArray<Double>,
    ): IIRFilterNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createOscillator) */
    fun createOscillator(): OscillatorNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPanner) */
    fun createPanner(): PannerNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPeriodicWave) */
    fun createPeriodicWave(
        real: ReadonlyArray<Double>,
        imag: ReadonlyArray<Double>,
        constraints: PeriodicWaveConstraints = definedExternally,
    ): PeriodicWave

    fun createPeriodicWave(
        real: Float32Array,
        imag: Float32Array,
        constraints: PeriodicWaveConstraints = definedExternally,
    ): PeriodicWave

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createStereoPanner) */
    fun createStereoPanner(): StereoPannerNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createWaveShaper) */
    fun createWaveShaper(): WaveShaperNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/decodeAudioData) */
    fun decodeAudioData(
        audioData: ArrayBuffer,
        successCallback: DecodeSuccessCallback? = definedExternally,
        errorCallback: DecodeErrorCallback? = definedExternally,
    ): Promise<AudioBuffer>
}
