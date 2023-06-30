package electron.core

import node.buffer.Buffer


external interface AddRepresentationOptions {
    /**
     * The scale factor to add the image representation for.
     */
    var scaleFactor: Double?

    /**
     * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
     */
    var width: Double?

    /**
     * Defaults to 0. Required if a bitmap buffer is specified as `buffer`.
     */
    var height: Double?

    /**
     * The buffer containing the raw image data.
     */
    var buffer: Buffer?

    /**
     * The data URL containing either a base 64 encoded PNG or JPEG image.
     */
    var dataURL: String?
}
