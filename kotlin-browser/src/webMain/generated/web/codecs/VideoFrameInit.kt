// Automatically generated - do not modify!

package web.codecs

import js.numbers.Int53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectReadOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#init)
 */
@JsPlainObject
external interface VideoFrameInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#alpha)
     */
    var alpha: AlphaOption?

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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#timestamp)
     */
    var timestamp: Int53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/VideoFrame#visiblerect)
     */
    var visibleRect: DOMRectReadOnly?
}
