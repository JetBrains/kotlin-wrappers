// Automatically generated - do not modify!

package web.codecs

import js.buffer.BufferSource
import js.core.JsLong
import js.core.ReadonlyArray
import web.canvas.CanvasImageSource
import web.geometry.DOMRectReadOnly
import kotlin.js.Promise

external class VideoFrame(
    image: CanvasImageSource,
    init: VideoFrameInit = definedExternally,
) {
    constructor(
        data: BufferSource,
        init: VideoFrameBufferInit,
    )

    val codedHeight: Int
    val codedRect: DOMRectReadOnly?
    val codedWidth: Int
    val colorSpace: VideoColorSpace
    val displayHeight: Int
    val displayWidth: Int
    val duration: Double?
    val format: VideoPixelFormat?
    val timestamp: JsLong
    val visibleRect: DOMRectReadOnly?
    fun allocationSize(options: VideoFrameCopyToOptions = definedExternally): Number
    fun clone(): VideoFrame
    fun close()
    fun copyTo(
        destination: BufferSource,
        options: VideoFrameCopyToOptions = definedExternally,
    ): Promise<ReadonlyArray<PlaneLayout>>
}
