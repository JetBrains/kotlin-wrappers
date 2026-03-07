// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.numbers.Int53
import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.geometry.DOMRectReadOnly

@JsPlainObject
external interface VideoFrameBufferInit {
    var codedHeight: Int
    var codedWidth: Int
    var colorSpace: VideoColorSpaceInit?
    var displayHeight: Int?
    var displayWidth: Int?
    var duration: UInt53?
    var format: VideoPixelFormat
    var layout: ReadonlyArray<PlaneLayout>?
    var timestamp: Int53
    var visibleRect: DOMRectReadOnly?
}
