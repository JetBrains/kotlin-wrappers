// Automatically generated - do not modify!

package web.audio

import web.html.HTMLMediaElement

/**
 * The `MediaElementAudioSourceNode` interface represents an audio source consisting of an HTML audio or video element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode)
 */
open external class MediaElementAudioSourceNode(
    context: AudioContext,
    options: MediaElementAudioSourceOptions,
) : AudioNode {
    /**
     * The MediaElementAudioSourceNode interface's read-only **`mediaElement`** property indicates the receiving audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode/mediaElement)
     */
    val mediaElement: HTMLMediaElement
}
