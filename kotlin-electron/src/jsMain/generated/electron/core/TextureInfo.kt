// Generated by Karakum - do not modify it manually!

package electron.core

import node.buffer.Buffer

external interface TextureInfo {
    /**
     * The widget type of the texture. Can be `popup` or `frame`.
     */
    var widgetType: (TextureInfoWidgetType)

    /**
     * The pixel format of the texture. Can be `rgba` or `bgra`.
     */
    var pixelFormat: (TextureInfoPixelFormat)

    /**
     * The full dimensions of the video frame.
     */
    var codedSize: Size

    /**
     * A subsection of [0, 0, codedSize.width(), codedSize.height()]. In OSR case, it
     * is expected to have the full section area.
     */
    var visibleRect: Rectangle

    /**
     * The region of the video frame that capturer would like to populate. In OSR case,
     * it is the same with `dirtyRect` that needs to be painted.
     */
    var contentRect: Rectangle

    /**
     * The time in microseconds since the capture start.
     */
    var timestamp: Double

    /**
     * Extra metadata. See comments in src\media\base\video_frame_metadata.h for
     * accurate details.
     */
    var metadata: Metadata

    /**
     * The handle to the shared texture.
     *
     * @platform win32,darwin
     */
    var sharedTextureHandle: Buffer<*>

    /**
     * Each plane's info of the shared texture.
     *
     * @platform linux
     */
    var planes: js.array.ReadonlyArray<Planes>

    /**
     * The modifier is retrieved from GBM library and passed to EGL driver.
     *
     * @platform linux
     */
    var modifier: String
}
