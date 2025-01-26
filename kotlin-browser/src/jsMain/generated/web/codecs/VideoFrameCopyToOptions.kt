// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.geometry.DOMRectReadOnly
import web.images.PredefinedColorSpace

@JsPlainObject
external interface VideoFrameCopyToOptions {
    val colorSpace: PredefinedColorSpace?
    val format: VideoPixelFormat?
    val layout: ReadonlyArray<PlaneLayout>?
    val rect: DOMRectReadOnly?
}
