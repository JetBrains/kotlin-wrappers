// Automatically generated - do not modify!

package electron.core

external interface SharedTextureImportTextureInfo {
// Docs: https://electronjs.org/docs/api/structures/shared-texture-import-texture-info
    /**
     * The full dimensions of the shared texture.
     */
    var codedSize: Size

    /**
     * The color space of the texture.
     */
    var colorSpace: ColorSpace?

    /**
     * The shared texture handle.
     */
    var handle: SharedTextureHandle

    /**
     * The pixel format of the texture.
     */
    var pixelFormat: (SharedTextureImportTextureInfoPixelFormat)

    /**
     * A timestamp in microseconds that will be reflected to `VideoFrame`.
     */
    var timestamp: Double?

    /**
     * A subsection of [0, 0, codedSize.width, codedSize.height]. In common cases, it
     * is the full section area.
     */
    var visibleRect: Rectangle?
}
