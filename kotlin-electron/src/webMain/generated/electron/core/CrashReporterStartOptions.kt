// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface CrashReporterStartOptions {
    /**
     * URL that crash reports will be sent to as POST. Required unless `uploadToServer`
     * is `false`.
     */
    var submitURL: String?

    /**
     * Defaults to `app.name`.
     */
    var productName: String?

    /**
     * Whether crash reports should be sent to the server. If false, crash reports will
     * be collected and stored in the crashes directory, but not uploaded. Default is
     * `true`.
     */
    var uploadToServer: Boolean?

    /**
     * If true, crashes generated in the main process will not be forwarded to the
     * system crash handler. This option has no effect on Windows. Default is `false`.
     *
     * @platform darwin,linux
     */
    var ignoreSystemCrashHandler: Boolean?

    /**
     * If true, limit the number of crashes uploaded to 1/hour. Crash reports over the
     * limit are not uploaded, but are still stored on disk. Default is `false`.
     */
    var rateLimit: Boolean?

    /**
     * If true, crash reports will be compressed and uploaded with `Content-Encoding:
     * gzip`. Setting this to `false` while `uploadToServer` is `true` is deprecated
     * and logs a deprecation warning. Default is `true`.
     */
    var compress: Boolean?

    /**
     * Extra string key/value annotations that will be sent along with crash reports
     * that are generated in the main process. Only string values are supported.
     * Crashes generated in child processes will not include these extra parameters. To
     * add extra parameters to crash reports generated from child processes, call
     * `addExtraParameter` from the child process.
     */
    var extra: js.objects.ReadonlyRecord<String, String>?

    /**
     * Extra string key/value annotations that will be sent along with any crash
     * reports generated in any process. These annotations cannot be changed once the
     * crash reporter has been started. If a key is present in both the global extra
     * parameters and the process-specific extra parameters, then the global one will
     * take precedence. By default, `productName` and the app version are included, as
     * well as the Electron version. Global extra parameters are not returned by
     * `getParameters()`.
     */
    var globalExtra: js.objects.ReadonlyRecord<String, String>?
}
