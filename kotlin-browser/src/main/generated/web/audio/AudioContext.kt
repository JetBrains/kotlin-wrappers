// Automatically generated - do not modify!

package web.audio

import dom.html.HTMLMediaElement
import js.core.Void
import media.streams.MediaStream
import kotlin.js.Promise

external class AudioContext(
    contextOptions: AudioContextOptions = definedExternally,
) : BaseAudioContext {
    val baseLatency: Double
    val outputLatency: Double
    fun close(): Promise<Void>
    fun createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode
    fun createMediaStreamDestination(): MediaStreamAudioDestinationNode
    fun createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode
    fun getOutputTimestamp(): AudioTimestamp
    fun resume(): Promise<Void>
    fun suspend(): Promise<Void>
}
