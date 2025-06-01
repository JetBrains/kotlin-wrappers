// Automatically generated - do not modify!

package web.audio

import web.mediastreams.MediaStream

/**
 * The **`MediaStreamAudioSourceNode`** interface is a type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode)
 */
open external class MediaStreamAudioSourceNode(
    context: AudioContext,
    options: MediaStreamAudioSourceOptions,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode/mediaStream)
     */
    val mediaStream: MediaStream
}
