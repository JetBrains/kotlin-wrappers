// Automatically generated - do not modify!

package web.audio

import web.html.HTMLMediaElement

/**
 * A MediaElementSourceNode has no inputs and exactly one output, and is created using the AudioContext.createMediaElementSource method. The amount of channels in the output equals the number of channels of the audio referenced by the HTMLMediaElement used in the creation of the node, or is 1 if the HTMLMediaElement has no audio.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode)
 */
external class MediaElementAudioSourceNode(
    context: AudioContext,
    options: MediaElementAudioSourceOptions,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode/mediaElement) */
    val mediaElement: HTMLMediaElement
}
