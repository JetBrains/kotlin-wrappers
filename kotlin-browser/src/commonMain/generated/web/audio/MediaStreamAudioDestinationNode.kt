// Automatically generated - do not modify!

package web.audio

import web.mediastreams.MediaStream
import kotlin.js.definedExternally

/**
 * The `MediaStreamAudioDestinationNode` interface represents an audio destination consisting of a WebRTC MediaStream with a single `AudioMediaStreamTrack`, which can be used in a similar way to a `MediaStream` obtained from MediaDevices.getUserMedia.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioDestinationNode)
 */
open external class MediaStreamAudioDestinationNode(
    context: AudioContext,
    options: AudioNodeOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioDestinationNode/stream)
     */
    val stream: MediaStream
}
