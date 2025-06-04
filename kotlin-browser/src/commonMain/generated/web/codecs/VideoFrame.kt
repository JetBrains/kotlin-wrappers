// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.core.Int53
import js.core.UInt53
import js.promise.Promise
import js.serialization.Serializable
import js.serialization.Transferable
import seskar.js.JsAsync
import web.canvas.CanvasImageSource
import web.geometry.DOMRectReadOnly
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`VideoFrame`** interface of the Web Codecs API represents a frame of a video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame)
 */
open external class VideoFrame(
    image: CanvasImageSource,
    init: VideoFrameInit = definedExternally,
) : CanvasImageSource,
    TexImageSource,
    GPUCopyExternalImageSource,
    Transferable,
    Serializable {
    constructor(
        data: AllowSharedBufferSource,
        init: VideoFrameBufferInit,
    )

    /**
     * The **`codedHeight`** property of the VideoFrame interface returns the height of the VideoFrame in pixels, potentially including non-visible padding, and prior to considering potential ratio adjustments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedHeight)
     */
    val codedHeight: Int

    /**
     * The **`codedRect`** property of the VideoFrame interface returns a DOMRectReadOnly with the width and height matching VideoFrame.codedWidth and VideoFrame.codedHeight.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedRect)
     */
    val codedRect: DOMRectReadOnly?

    /**
     * The **`codedWidth`** property of the VideoFrame interface returns the width of the `VideoFrame` in pixels, potentially including non-visible padding, and prior to considering potential ratio adjustments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedWidth)
     */
    val codedWidth: Int

    /**
     * The **`colorSpace`** property of the VideoFrame interface returns a VideoColorSpace object representing the color space of the video.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/colorSpace)
     */
    val colorSpace: VideoColorSpace

    /**
     * The **`displayHeight`** property of the VideoFrame interface returns the height of the `VideoFrame` after applying aspect ratio adjustments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayHeight)
     */
    val displayHeight: Int

    /**
     * The **`displayWidth`** property of the VideoFrame interface returns the width of the `VideoFrame` after applying aspect ratio adjustments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayWidth)
     */
    val displayWidth: Int

    /**
     * The **`duration`** property of the VideoFrame interface returns an integer indicating the duration of the video in microseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/duration)
     */
    val duration: UInt53?

    /**
     * The **`format`** property of the VideoFrame interface returns the pixel format of the `VideoFrame`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format)
     */
    val format: VideoPixelFormat?

    /**
     * The **`timestamp`** property of the VideoFrame interface returns an integer indicating the timestamp of the video in microseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/timestamp)
     */
    val timestamp: Int53

    /**
     * The **`visibleRect`** property of the VideoFrame interface returns a DOMRectReadOnly describing the visible rectangle of pixels for this `VideoFrame`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/visibleRect)
     */
    val visibleRect: DOMRectReadOnly?

    /**
     * The **`allocationSize()`** method of the VideoFrame interface returns the number of bytes required to hold the video as filtered by options passed into the method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize)
     */
    fun allocationSize(options: VideoFrameCopyToOptions = definedExternally): Int

    /**
     * The **`clone()`** method of the VideoFrame interface creates a new `VideoFrame` object referencing the same media resource as the original.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/clone)
     */
    fun clone(): VideoFrame

    /**
     * The **`close()`** method of the VideoFrame interface clears all states and releases the reference to the media resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/close)
     */
    fun close()

    /**
     * The **`copyTo()`** method of the VideoFrame interface copies the contents of the `VideoFrame` to an `ArrayBuffer`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/copyTo)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun copyTo(
        destination: AllowSharedBufferSource,
        options: VideoFrameCopyToOptions = definedExternally,
    ): ReadonlyArray<PlaneLayout>

    @JsName("copyTo")
    fun copyToAsync(
        destination: AllowSharedBufferSource,
        options: VideoFrameCopyToOptions = definedExternally,
    ): Promise<ReadonlyArray<PlaneLayout>>
}
