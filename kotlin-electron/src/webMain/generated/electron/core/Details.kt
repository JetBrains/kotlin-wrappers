// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
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
     * The exit code for the process (e.g. status from waitpid if on POSIX, from
     * GetExitCodeProcess on Windows), unless `reason` is `launch-failed`, in which
     * case `exitCode` will be a platform-specific launch failure error code.
     */
    var exitCode: Double

    /**
     * The Windows system error code (`GetLastError()`) of the failed launch. Only set
     * when `reason` is `launch-failed`.
     *
     * @platform win32
     */
    var systemErrorCode: Double?

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
