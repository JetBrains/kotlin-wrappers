// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventHandler
import web.window.PictureInPictureWindow
import kotlin.js.Promise

abstract external class HTMLVideoElement :
    HTMLMediaElement {
    var disablePictureInPicture: Boolean

    /**
     * Gets or sets the height of the video element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/height)
     */
    var height: Double
    var onenterpictureinpicture: EventHandler<Event>?
    var onleavepictureinpicture: EventHandler<Event>?

    /** Gets or sets the playsinline of the video element. for example, On iPhone, video elements will now be allowed to play inline, and will not automatically enter fullscreen mode when playback begins. */
    var playsInline: Boolean

    /**
     * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/poster)
     */
    var poster: String

    /**
     * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoHeight)
     */
    val videoHeight: Int

    /**
     * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoWidth)
     */
    val videoWidth: Int

    /**
     * Gets or sets the width of the video element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/width)
     */
    var width: Double
    fun cancelVideoFrameCallback(requestId: VideoFrameRequestId)
    fun getVideoPlaybackQuality(): VideoPlaybackQuality
    fun requestPictureInPicture(): Promise<PictureInPictureWindow>
    fun requestVideoFrameCallback(callback: VideoFrameRequestCallback): VideoFrameRequestId
}
