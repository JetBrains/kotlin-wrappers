package electron.core


external interface CreateInterruptedDownloadOptions {
    /**
     * Absolute path of the download.
     */
    var path: String

    /**
     * Complete URL chain for the download.
     */
    var urlChain: js.core.ReadonlyArray<String>
    var mimeType: String?

    /**
     * Start range for the download.
     */
    var offset: Double

    /**
     * Total length of the download.
     */
    var length: Double

    /**
     * Last-Modified header value.
     */
    var lastModified: String?

    /**
     * ETag header value.
     */
    var eTag: String?

    /**
     * Time when download was started in number of seconds since UNIX epoch.
     */
    var startTime: Double?
}
