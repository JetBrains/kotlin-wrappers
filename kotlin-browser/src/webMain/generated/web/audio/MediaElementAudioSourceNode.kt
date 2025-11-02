// Automatically generated - do not modify!

package web.audio

import web.html.HTMLMediaElement

/**
 * The **`MediaElementAudioSourceNode`** interface represents an audio source consisting of an HTML <audio> or <video> element. It is an AudioNode that acts as an audio source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode)
 */
open external class MediaElementAudioSourceNode(
    context: AudioContext,
    options: MediaElementAudioSourceOptions,
) : AudioNode {
    /**
     * The MediaElementAudioSourceNode interface's read-only **`mediaElement`** property indicates the HTMLMediaElement that contains the audio track from which the node is receiving audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode/mediaElement)
     */
    val mediaElement: HTMLMediaElement
}
