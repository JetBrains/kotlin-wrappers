// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectReadOnly
import web.images.PredefinedColorSpace

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize#options)
 */
@JsPlainObject
external interface VideoFrameCopyToOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize#colorspace)
     */
    var colorSpace: PredefinedColorSpace?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize#format)
     */
    var format: VideoPixelFormat?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize#layout)
     */
    var layout: ReadonlyArray<PlaneLayout>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoFrame/allocationSize#rect)
     */
    var rect: DOMRectReadOnly?
}
