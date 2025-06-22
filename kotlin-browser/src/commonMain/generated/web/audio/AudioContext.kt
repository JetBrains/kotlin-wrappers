// Automatically generated - do not modify!

package web.audio

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.Event
import web.events.EventInstance
import web.html.HTMLMediaElement
import web.mediastreams.MediaStream
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The `AudioContext` interface represents an audio-processing graph built from audio modules linked together, each represented by an AudioNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext)
 */
open external class AudioContext(
    contextOptions: AudioContextOptions = definedExternally,
) : BaseAudioContext {
    /**
     * The **`baseLatency`** read-only property of the seconds of processing latency incurred by the `AudioContext` passing an audio buffer from the AudioDestinationNode — i.e., the end of the audio graph — into the host system's audio subsystem ready for playing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/baseLatency)
     */
    val baseLatency: Double

    /**
     * The **`outputLatency`** read-only property of the AudioContext Interface provides an estimation of the output latency of the current audio context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/outputLatency)
     */
    val outputLatency: Double

    /**
     * The `close()` method of the AudioContext Interface closes the audio context, releasing any system audio resources that it uses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/close)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun close()

    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * The `createMediaElementSource()` method of the AudioContext Interface is used to create a new MediaElementAudioSourceNode object, given an existing HTML audio or video element, the audio from which can then be played and manipulated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaElementSource)
     */
    fun createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode

    /**
     * The `createMediaStreamDestination()` method of the AudioContext Interface is used to create a new MediaStreamAudioDestinationNode object associated with a WebRTC MediaStream representing an audio stream, which may be stored in a local file or sent to another computer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamDestination)
     */
    fun createMediaStreamDestination(): MediaStreamAudioDestinationNode

    /**
     * The `createMediaStreamSource()` method of the AudioContext Interface is used to create a new MediaStreamAudioSourceNode object, given a media stream (say, from a MediaDevices.getUserMedia instance), the audio from which can then be played and manipulated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamSource)
     */
    fun createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode

    /**
     * The **`getOutputTimestamp()`** method of the containing two audio timestamp values relating to the current audio context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/getOutputTimestamp)
     */
    fun getOutputTimestamp(): AudioTimestamp

    /**
     * The **`resume()`** method of the AudioContext interface resumes the progression of time in an audio context that has previously been suspended.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/resume)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun resume()

    @JsName("resume")
    fun resumeAsync(): Promise<Void>

    /**
     * The `suspend()` method of the AudioContext Interface suspends the progression of time in the audio context, temporarily halting audio hardware access and reducing CPU/battery usage in the process — this is useful if you want an application to power down the audio hardware when it will not be using an audio context for a while.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/suspend)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun suspend()

    @JsName("suspend")
    fun suspendAsync(): Promise<Void>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/error_event)
 */
inline val <C : AudioContext> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")
