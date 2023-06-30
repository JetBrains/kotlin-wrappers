package electron.core


external interface Details {
    /**
     * Process type. One of the following values:
     */
    var type: (DetailsType)

    /**
     * The reason the child process is gone. Possible values:
     */
    var reason: (DetailsReason)

    /**
     * The exit code for the process (e.g. status from waitpid if on posix, from
     * GetExitCodeProcess on Windows).
     */
    var exitCode: Double

    /**
     * The non-localized name of the process.
     */
    var serviceName: String?

    /**
     * The name of the process. Examples for utility: `Audio Service`, `Content
     * Decryption Module Service`, `Network Service`, `Video Capture`, etc.
     */
    var name: String?
}
