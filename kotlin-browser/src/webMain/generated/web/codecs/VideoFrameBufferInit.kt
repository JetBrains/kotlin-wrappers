// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.numbers.Int53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectReadOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#init)
 */
@JsPlainObject
external interface VideoFrameBufferInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#codedheight)
     */
    var codedHeight: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#codedwidth)
     */
    var codedWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#colorspace)
     */
    var colorSpace: VideoColorSpaceInit?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#displayheight)
     */
    var displayHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#displaywidth)
     */
    var displayWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#duration)
     */
    var duration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#format)
     */
    var format: VideoPixelFormat

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#layout)
     */
    var layout: ReadonlyArray<PlaneLayout>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#timestamp)
     */
    var timestamp: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#visiblerect)
     */
    var visibleRect: DOMRectReadOnly?
}
