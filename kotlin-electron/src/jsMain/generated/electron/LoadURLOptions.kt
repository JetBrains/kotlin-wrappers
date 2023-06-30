package electron


external interface LoadURLOptions {
    /**
     * An HTTP Referrer url.
     */
    var httpReferrer: Any /* (string) | (Referrer) */?

    /**
     * A user agent originating the request.
     */
    var userAgent: String?

    /**
     * Extra headers separated by "\n"
     */
    var extraHeaders: String?
    var postData: Array<Any /* (UploadRawData) | (UploadFile) */>?

    /**
     * Base url (with trailing path separator) for files to be loaded by the data url.
     * This is needed only if the specified `url` is a data url and needs to load other
     * files.
     */
    var baseURLForDataURL: String?
}
