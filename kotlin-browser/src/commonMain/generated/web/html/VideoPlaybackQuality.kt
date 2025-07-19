// Automatically generated - do not modify!

package web.html

import web.time.DOMHighResTimeStamp

/**
 * A **`VideoPlaybackQuality`** object is returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality)
 */
open external class VideoPlaybackQuality
private constructor() {
    /**
     * The read-only **`creationTime`** property on the the browsing context was created this quality sample was recorded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/creationTime)
     */
    val creationTime: DOMHighResTimeStamp

    /**
     * The read-only **`droppedVideoFrames`** property of the VideoPlaybackQuality interface returns the number of video frames which have been dropped rather than being displayed since the last time the media was loaded into the HTMLVideoElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/droppedVideoFrames)
     */
    val droppedVideoFrames: Int

    /**
     * The VideoPlaybackQuality interface's **`totalVideoFrames`** read-only property returns the total number of video frames that have been displayed or dropped since the media was loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/totalVideoFrames)
     */
    val totalVideoFrames: Int
}
