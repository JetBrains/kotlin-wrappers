// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.core.JsLong
import js.objects.JsPlainObject
import web.geometry.DOMRectInit

@JsPlainObject
external interface VideoFrameBufferInit {
    val codedHeight: UInt
    val codedWidth: UInt
    val colorSpace: VideoColorSpaceInit?
    val displayHeight: UInt?
    val displayWidth: UInt?
    val duration: JsLong?
    val format: VideoPixelFormat
    val layout: ReadonlyArray<PlaneLayout>?
    val timestamp: JsLong
    val visibleRect: DOMRectInit?
}
