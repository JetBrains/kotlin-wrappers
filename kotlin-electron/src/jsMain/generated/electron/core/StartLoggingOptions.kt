package electron.core


external interface StartLoggingOptions {
    /**
     * What kinds of data should be captured. By default, only metadata about requests
     * will be captured. Setting this to `includeSensitive` will include cookies and
     * authentication data. Setting it to `everything` will include all bytes
     * transferred on sockets. Can be `default`, `includeSensitive` or `everything`.
     */
    var captureMode: (StartLoggingOptionsCaptureMode)?

    /**
     * When the log grows beyond this size, logging will automatically stop. Defaults
     * to unlimited.
     */
    var maxFileSize: Double?
}
