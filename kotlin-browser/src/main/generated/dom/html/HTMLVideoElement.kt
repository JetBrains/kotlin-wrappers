// Automatically generated - do not modify!

package dom.html

import web.events.Event
import kotlin.js.Promise

abstract external class HTMLVideoElement :
    HTMLMediaElement {
    var disablePictureInPicture: Boolean

    /** Gets or sets the height of the video element. */
    var height: Double
    var onenterpictureinpicture: ((event: Event) -> Unit)?
    var onleavepictureinpicture: ((event: Event) -> Unit)?

    /** Gets or sets the playsinline of the video element. for example, On iPhone, video elements will now be allowed to play inline, and will not automatically enter fullscreen mode when playback begins. */
    var playsInline: Boolean

    /** Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available. */
    var poster: String

    /** Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known. */
    val videoHeight: Int

    /** Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known. */
    val videoWidth: Int

    /** Gets or sets the width of the video element. */
    var width: Double
    fun cancelVideoFrameCallback(requestId: VideoFrameRequestId)
    fun getVideoPlaybackQuality(): VideoPlaybackQuality
    fun requestPictureInPicture(): Promise<PictureInPictureWindow>
    fun requestVideoFrameCallback(callback: VideoFrameRequestCallback): VideoFrameRequestId
}
