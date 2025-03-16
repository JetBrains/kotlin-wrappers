// Automatically generated - do not modify!

package web.codecs

import js.array.ReadonlyArray
import js.core.Int53
import js.core.UInt53
import js.objects.JsPlainObject
import web.geometry.DOMRectReadOnly

@JsPlainObject
external interface VideoFrameBufferInit {
    val codedHeight: Int
    val codedWidth: Int
    val colorSpace: VideoColorSpaceInit?
    val displayHeight: Int?
    val displayWidth: Int?
    val duration: UInt53?
    val format: VideoPixelFormat
    val layout: ReadonlyArray<PlaneLayout>?
    val timestamp: Int53
    val visibleRect: DOMRectReadOnly?
}
