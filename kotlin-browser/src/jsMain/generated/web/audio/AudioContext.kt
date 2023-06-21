// Automatically generated - do not modify!

package web.audio

import js.core.Void
import web.html.HTMLMediaElement
import web.media.streams.MediaStream
import kotlin.js.Promise

external class AudioContext(
    contextOptions: AudioContextOptions = definedExternally,
) : BaseAudioContext {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/baseLatency) */
    val baseLatency: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/outputLatency) */
    val outputLatency: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/close) */
    fun close(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaElementSource) */
    fun createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamDestination) */
    fun createMediaStreamDestination(): MediaStreamAudioDestinationNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamSource) */
    fun createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/getOutputTimestamp) */
    fun getOutputTimestamp(): AudioTimestamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/resume) */
    fun resume(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/suspend) */
    fun suspend(): Promise<Void>
}
