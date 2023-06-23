// Automatically generated - do not modify!

package web.html

import js.core.DOMHighResTimeStamp

/**
 * Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality)
 */
sealed external class VideoPlaybackQuality {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/creationTime) */
    val creationTime: DOMHighResTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/droppedVideoFrames) */
    val droppedVideoFrames: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoPlaybackQuality/totalVideoFrames) */
    val totalVideoFrames: Int
}
