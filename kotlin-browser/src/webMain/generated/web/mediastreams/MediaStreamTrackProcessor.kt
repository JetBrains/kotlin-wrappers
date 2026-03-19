// Automatically generated - do not modify!

package web.mediastreams

import web.codecs.VideoFrame
import web.streams.ReadableStream

/**
 * The **`MediaStreamTrackProcessor`** interface of the Insertable Streams for MediaStreamTrack API consumes a video MediaStreamTrack object's source and generates a stream of VideoFrame objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackProcessor)
 */
open external class MediaStreamTrackProcessor(
    init: MediaStreamTrackProcessorInit,
) {
    /**
     * The **`readable`** property of the MediaStreamTrackProcessor interface returns a ReadableStream of VideoFrames.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackProcessor/readable)
     */
    val readable: ReadableStream<VideoFrame>
}
