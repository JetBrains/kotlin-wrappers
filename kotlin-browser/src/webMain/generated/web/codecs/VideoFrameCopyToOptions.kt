// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.geometry.DOMRectReadOnly
import web.images.PredefinedColorSpace

@JsPlainObject
external interface VideoFrameCopyToOptions {
    var colorSpace: PredefinedColorSpace?
    var format: VideoPixelFormat?
    var layout: ReadonlyArray<PlaneLayout>?
    var rect: DOMRectReadOnly?
}
