// Automatically generated - do not modify!

package electron.core

external interface SharedTextureTransfer {
// Docs: https://electronjs.org/docs/api/structures/shared-texture-transfer
    /**
     * The full dimensions of the shared texture.
     *
     */
    val codedSize: Size

    /**
     * The pixel format of the transferring texture.
     *
     */
    val pixelFormat: String

    /**
     * The opaque sync token data for frame creation.
     *
     */
    val syncToken: String

    /**
     * A timestamp in microseconds that will be reflected to `VideoFrame`.
     *
     */
    val timestamp: Double

    /**
     * The opaque transfer data of the shared texture. This can be transferred across
     * Electron processes.
     *
     */
    val transfer: String

    /**
     * A subsection of [0, 0, codedSize.width(), codedSize.height()]. In common cases,
     * it is the full section area.
     *
     */
    val visibleRect: Rectangle
}
