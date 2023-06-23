// Automatically generated - do not modify!

package web.audio

import web.media.streams.MediaStream

/**
 * A type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode)
 */
external class MediaStreamAudioSourceNode(
    context: AudioContext,
    options: MediaStreamAudioSourceOptions,
) : AudioNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode/mediaStream) */
    val mediaStream: MediaStream
}
