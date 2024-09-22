// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectInit
import web.images.PredefinedColorSpace

@JsPlainObject
external interface VideoFrameCopyToOptions {
    var colorSpace: PredefinedColorSpace?
    var format: VideoPixelFormat?
    var layout: ReadonlyArray<PlaneLayout>?
    var rect: DOMRectInit?
}
