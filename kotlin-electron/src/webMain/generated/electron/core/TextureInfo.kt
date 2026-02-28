// Automatically generated - do not modify!

package electron.core

external interface TextureInfo {
    /**
     * The widget type of the texture. Can be `popup` or `frame`.
     */
    var widgetType: (TextureInfoWidgetType)

    /**
     * The pixel format of the texture.
     */
    var pixelFormat: (TextureInfoPixelFormat)

    /**
     * The full dimensions of the video frame.
     */
    var codedSize: Size

    /**
     * The color space of the video frame.
     */
    var colorSpace: ColorSpace

    /**
     * A subsection of [0, 0, codedSize.width, codedSize.height]. In OSR case, it is
     * expected to have the full section area.
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
     * The shared texture handle data.
     */
    var handle: SharedTextureHandle
}
