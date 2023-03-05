// Automatically generated - do not modify!

package web.codecs

import js.core.JsLong
import js.core.ReadonlyArray
import web.geometry.DOMRectInit

sealed external interface VideoFrameBufferInit {
    var codedHeight: Int
    var codedWidth: Int
    var colorSpace: VideoColorSpaceInit?
    var displayHeight: Int?
    var displayWidth: Int?
    var duration: Double?
    var format: VideoPixelFormat
    var layout: ReadonlyArray<PlaneLayout>?
    var timestamp: JsLong
    var visibleRect: DOMRectInit?
}
