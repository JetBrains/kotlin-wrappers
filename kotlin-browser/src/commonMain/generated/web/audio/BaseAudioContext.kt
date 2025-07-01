// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsDouble
import js.promise.Promise
import js.typedarrays.Float32Array
import seskar.js.JsAsync
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The `BaseAudioContext` interface of the Web Audio API acts as a base definition for online and offline audio-processing graphs, as represented by AudioContext and OfflineAudioContext respectively.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext)
 */
open external class BaseAudioContext
private constructor() :
    EventTarget {
    /**
     * The `audioWorklet` read-only property of the processing.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/audioWorklet)
     */
    val audioWorklet: AudioWorklet

    /**
     * The `currentTime` read-only property of the BaseAudioContext interface returns a double representing an ever-increasing hardware timestamp in seconds that can be used for scheduling audio playback, visualizing timelines, etc.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/currentTime)
     */
    val currentTime: Double

    /**
     * The `destination` property of the BaseAudioContext interface returns an AudioDestinationNode representing the final destination of all audio in the context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/destination)
     */
    val destination: AudioDestinationNode

    /**
     * The `listener` property of the BaseAudioContext interface returns an AudioListener object that can then be used for implementing 3D audio spatialization.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/listener)
     */
    val listener: AudioListener

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/statechange_event)
     */
    var onstatechange: EventHandler<Event, BaseAudioContext, BaseAudioContext>?

    /**
     * The `sampleRate` property of the BaseAudioContext interface returns a floating point number representing the sample rate, in samples per second, used by all nodes in this audio context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/sampleRate)
     */
    val sampleRate: Float

    /**
     * The `state` read-only property of the BaseAudioContext interface returns the current state of the `AudioContext`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state)
     */
    val state: AudioContextState

    /**
     * The `createAnalyser()` method of the can be used to expose audio time and frequency data and create data visualizations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createAnalyser)
     */
    fun createAnalyser(): AnalyserNode

    /**
     * The `createBiquadFilter()` method of the BaseAudioContext interface creates a BiquadFilterNode, which represents a second order filter configurable as several different common filter types.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBiquadFilter)
     */
    fun createBiquadFilter(): BiquadFilterNode

    /**
     * The `createBuffer()` method of the BaseAudioContext Interface is used to create a new, empty AudioBuffer object, which can then be populated by data, and played via an AudioBufferSourceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBuffer)
     */
    fun createBuffer(
        numberOfChannels: Int,
        length: Int,
        sampleRate: Float,
    ): AudioBuffer

    /**
     * The `createBufferSource()` method of the BaseAudioContext Interface is used to create a new AudioBufferSourceNode, which can be used to play audio data contained within an AudioBuffer object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBufferSource)
     */
    fun createBufferSource(): AudioBufferSourceNode

    /**
     * The `createChannelMerger()` method of the BaseAudioContext interface creates a ChannelMergerNode, which combines channels from multiple audio streams into a single audio stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelMerger)
     */
    fun createChannelMerger(numberOfInputs: Int = definedExternally): ChannelMergerNode

    /**
     * The `createChannelSplitter()` method of the BaseAudioContext Interface is used to create a ChannelSplitterNode, which is used to access the individual channels of an audio stream and process them separately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelSplitter)
     */
    fun createChannelSplitter(numberOfOutputs: Int = definedExternally): ChannelSplitterNode

    /**
     * The **`createConstantSource()`** property of the BaseAudioContext interface creates a outputs a monaural (one-channel) sound signal whose samples all have the same value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConstantSource)
     */
    fun createConstantSource(): ConstantSourceNode

    /**
     * The `createConvolver()` method of the BaseAudioContext interface creates a ConvolverNode, which is commonly used to apply reverb effects to your audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConvolver)
     */
    fun createConvolver(): ConvolverNode

    /**
     * The `createDelay()` method of the which is used to delay the incoming audio signal by a certain amount of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDelay)
     */
    fun createDelay(maxDelayTime: Double = definedExternally): DelayNode

    /**
     * The `createDynamicsCompressor()` method of the BaseAudioContext Interface is used to create a DynamicsCompressorNode, which can be used to apply compression to an audio signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDynamicsCompressor)
     */
    fun createDynamicsCompressor(): DynamicsCompressorNode

    /**
     * The `createGain()` method of the BaseAudioContext interface creates a GainNode, which can be used to control the overall gain (or volume) of the audio graph.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createGain)
     */
    fun createGain(): GainNode

    /**
     * The **`createIIRFilter()`** method of the BaseAudioContext interface creates an IIRFilterNode, which represents a general **infinite impulse response** (IIR) filter which can be configured to serve as various types of filter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createIIRFilter)
     */
    fun createIIRFilter(
        feedforward: ReadonlyArray<JsDouble>,
        feedback: ReadonlyArray<JsDouble>,
    ): IIRFilterNode

    /**
     * The `createOscillator()` method of the BaseAudioContext interface creates an OscillatorNode, a source representing a periodic waveform.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createOscillator)
     */
    fun createOscillator(): OscillatorNode

    /**
     * The `createPanner()` method of the BaseAudioContext Interface is used to create a new PannerNode, which is used to spatialize an incoming audio stream in 3D space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPanner)
     */
    fun createPanner(): PannerNode

    /**
     * The `createPeriodicWave()` method of the BaseAudioContext interface is used to create a PeriodicWave.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPeriodicWave)
     */
    fun createPeriodicWave(
        real: ReadonlyArray<JsDouble>,
        imag: ReadonlyArray<JsDouble>,
        constraints: PeriodicWaveConstraints = definedExternally,
    ): PeriodicWave

    fun createPeriodicWave(
        real: Float32Array<*>,
        imag: Float32Array<*>,
        constraints: PeriodicWaveConstraints = definedExternally,
    ): PeriodicWave

    /**
     * The `createStereoPanner()` method of the BaseAudioContext interface creates a StereoPannerNode, which can be used to apply stereo panning to an audio source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createStereoPanner)
     */
    fun createStereoPanner(): StereoPannerNode

    /**
     * The `createWaveShaper()` method of the BaseAudioContext interface creates a WaveShaperNode, which represents a non-linear distortion.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createWaveShaper)
     */
    fun createWaveShaper(): WaveShaperNode

    /**
     * The `decodeAudioData()` method of the BaseAudioContext Interface is used to asynchronously decode audio file data contained in an rate, then passed to a callback or promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/decodeAudioData)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun decodeAudioData(audioData: ArrayBuffer): AudioBuffer

    @JsName("decodeAudioData")
    fun decodeAudioDataAsync(audioData: ArrayBuffer): Promise<AudioBuffer>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/statechange_event)
 */
inline val <C : BaseAudioContext> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "statechange")
