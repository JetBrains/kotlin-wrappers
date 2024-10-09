// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectInit
import web.images.PredefinedColorSpace

@JsPlainObject
external interface VideoFrameCopyToOptions {
    val colorSpace: PredefinedColorSpace?
    val format: VideoPixelFormat?
    val layout: ReadonlyArray<PlaneLayout>?
    val rect: DOMRectInit?
}
