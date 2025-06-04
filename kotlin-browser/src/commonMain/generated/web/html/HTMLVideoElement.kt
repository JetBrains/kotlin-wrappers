// Automatically generated - do not modify!

package web.html

import js.promise.Promise
import seskar.js.JsAsync
import web.canvas.CanvasImageSource
import web.dom.Node
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import web.pip.PictureInPictureEvent
import web.pip.PictureInPictureWindow
import kotlin.js.JsName

/**
 * Implemented by the video element, the **`HTMLVideoElement`** interface provides special properties and methods for manipulating video objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement)
 */
open external class HTMLVideoElement
protected constructor() :
    HTMLMediaElement,
    CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource {
    /**
     * The HTMLVideoElement **`disablePictureInPicture`** property reflects the HTML attribute indicating whether the picture-in-picture feature is disabled for the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/disablePictureInPicture)
     */
    var disablePictureInPicture: Boolean

    /**
     * The **`height`** property of the HTMLVideoElement interface returns an integer that reflects the `height` attribute of the video element, specifying the displayed height of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/height)
     */
    var height: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/enterpictureinpicture_event)
     */
    var onenterpictureinpicture: EventHandler<PictureInPictureEvent, HTMLVideoElement, Node>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/leavepictureinpicture_event)
     */
    var onleavepictureinpicture: EventHandler<PictureInPictureEvent, HTMLVideoElement, Node>?
    var playsInline: Boolean

    /**
     * The **`poster`** property of the HTMLVideoElement interface is a string that reflects the URL for an image to be shown while no video data is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/poster)
     */
    var poster: String

    /**
     * The HTMLVideoElement interface's read-only **`videoHeight`** property indicates the intrinsic height of the video, expressed in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoHeight)
     */
    val videoHeight: Int

    /**
     * The HTMLVideoElement interface's read-only **`videoWidth`** property indicates the intrinsic width of the video, expressed in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoWidth)
     */
    val videoWidth: Int

    /**
     * The **`width`** property of the HTMLVideoElement interface returns an integer that reflects the `width` attribute of the video element, specifying the displayed width of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/width)
     */
    var width: Int

    /**
     * The **`cancelVideoFrameCallback()`** method of the HTMLVideoElement interface cancels a previously-registered video frame callback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/cancelVideoFrameCallback)
     */
    fun cancelVideoFrameCallback(requestId: VideoFrameRequestId)

    /**
     * The **HTMLVideoElement** method **`getVideoPlaybackQuality()`** creates and returns a frames have been lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/getVideoPlaybackQuality)
     */
    fun getVideoPlaybackQuality(): VideoPlaybackQuality

    /**
     * The **HTMLVideoElement** method **`requestPictureInPicture()`** issues an asynchronous request to display the video in picture-in-picture mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/requestPictureInPicture)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestPictureInPicture(): PictureInPictureWindow

    @JsName("requestPictureInPicture")
    fun requestPictureInPictureAsync(): Promise<PictureInPictureWindow>

    /**
     * The **`requestVideoFrameCallback()`** method of the HTMLVideoElement interface registers a callback function that runs when a new video frame is sent to the compositor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/requestVideoFrameCallback)
     */
    fun requestVideoFrameCallback(callback: VideoFrameRequestCallback): VideoFrameRequestId

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/enterpictureinpicture_event)
     */
    @JsEvent("enterpictureinpicture")
    val enterPictureInPictureEvent: EventInstance<PictureInPictureEvent, HTMLVideoElement /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/leavepictureinpicture_event)
     */
    @JsEvent("leavepictureinpicture")
    val leavePictureInPictureEvent: EventInstance<PictureInPictureEvent, HTMLVideoElement /* this */, Node>
}
