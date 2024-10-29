// Automatically generated - do not modify!

package web.audio

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.errors.ErrorEvent
import web.events.EventInstance
import web.events.JsEvent
import web.html.HTMLMediaElement
import web.media.streams.MediaStream

/**
 * An audio-processing graph built from audio modules linked together, each represented by an AudioNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext)
 */
open external class AudioContext(
    contextOptions: AudioContextOptions = definedExternally,
) : BaseAudioContext {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/baseLatency)
     */
    val baseLatency: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/outputLatency)
     */
    val outputLatency: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/close)
     */
    @JsAsync
    suspend fun close()

    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaElementSource)
     */
    fun createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamDestination)
     */
    fun createMediaStreamDestination(): MediaStreamAudioDestinationNode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamSource)
     */
    fun createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/getOutputTimestamp)
     */
    fun getOutputTimestamp(): AudioTimestamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/resume)
     */
    @JsAsync
    suspend fun resume()

    @JsName("resume")
    fun resumeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/suspend)
     */
    @JsAsync
    suspend fun suspend()

    @JsName("suspend")
    fun suspendAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<ErrorEvent, AudioContext /* this */, AudioContext /* this */>
}
