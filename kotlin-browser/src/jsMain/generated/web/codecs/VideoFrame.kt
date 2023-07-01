// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.core.JsLong
import js.core.ReadonlyArray
import js.promise.Promise
import web.canvas.CanvasImageSource
import web.geometry.DOMRectReadOnly

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame) */
external class VideoFrame(
    image: CanvasImageSource,
    init: VideoFrameInit = definedExternally,
) {
    constructor(
        data: AllowSharedBufferSource,
        init: VideoFrameBufferInit,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedHeight) */
    val codedHeight: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedRect) */
    val codedRect: DOMRectReadOnly?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/codedWidth) */
    val codedWidth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/colorSpace) */
    val colorSpace: VideoColorSpace

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayHeight) */
    val displayHeight: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/displayWidth) */
    val displayWidth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/duration) */
    val duration: Double?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/format) */
    val format: VideoPixelFormat?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/timestamp) */
    val timestamp: JsLong

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/visibleRect) */
    val visibleRect: DOMRectReadOnly?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize) */
    fun allocationSize(options: VideoFrameCopyToOptions = definedExternally): Number

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/clone) */
    fun clone(): VideoFrame

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/close) */
    fun close()
    fun copyTo(
        destination: AllowSharedBufferSource,
        options: VideoFrameCopyToOptions = definedExternally,
    ): Promise<ReadonlyArray<PlaneLayout>>
}
