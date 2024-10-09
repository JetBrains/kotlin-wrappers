// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.core.JsLong
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectInit

@JsPlainObject
external interface VideoFrameBufferInit {
    val codedHeight: Int
    val codedWidth: Int
    val colorSpace: VideoColorSpaceInit?
    val displayHeight: Int?
    val displayWidth: Int?
    val duration: JsLong?
    val format: VideoPixelFormat
    val layout: ReadonlyArray<PlaneLayout>?
    val timestamp: JsLong
    val visibleRect: DOMRectInit?
}
