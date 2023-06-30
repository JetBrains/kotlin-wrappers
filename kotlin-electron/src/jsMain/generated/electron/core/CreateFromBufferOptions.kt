package electron.core


external interface CreateFromBufferOptions {
    /**
     * Required for bitmap buffers.
     */
    var width: Double?

    /**
     * Required for bitmap buffers.
     */
    var height: Double?

    /**
     * Defaults to 1.0.
     */
    var scaleFactor: Double?
}
