package electron.core


external interface UploadProgress {
    /**
     * Whether the request is currently active. If this is false no other properties
     * will be set
     */
    var active: Boolean

    /**
     * Whether the upload has started. If this is false both `current` and `total` will
     * be set to 0.
     */
    var started: Boolean

    /**
     * The number of bytes that have been uploaded so far
     */
    var current: Double

    /**
     * The number of bytes that will be uploaded this request
     */
    var total: Double
}
