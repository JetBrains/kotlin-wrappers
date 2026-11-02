// Automatically generated - do not modify!

package electron.core

external interface CrashReporter {
// Docs: https://electronjs.org/docs/api/crash-reporter
    /**
     * Set an extra parameter to be sent with the crash report. The values specified
     * here will be sent in addition to any values set via the `extra` option when
     * `start` was called. Calling this again with the same key replaces the value. The
     * value is read when a crash happens, so you can update it as your app's state
     * changes.
     *
     * Parameters added in this fashion (or via the `extra` parameter to
     * `crashReporter.start`) are specific to the calling process. Adding extra
     * parameters in the main process will not cause those parameters to be sent along
     * with crashes from renderer or other child processes. Similarly, adding extra
     * parameters in a renderer process will not result in those parameters being sent
     * with crashes that occur in other renderer processes or in the main process.
     * Processes created with `utilityProcess` have no API for setting extra
     * parameters, so only `globalExtra` values are sent with their crashes.
     *
     * > [!NOTE] Parameters have limits on the length of the keys and values. Key names
     * must be no longer than 39 bytes, and values must be no longer than 20320 bytes.
     * Keys with names longer than the maximum are ignored, and a warning is emitted.
     * Values longer than the maximum length are truncated.
     */
    fun addExtraParameter(
        key: String,
        value: String,
    )

    /**
     * The date and ID of the crash report with the most recent upload time, from the
     * list returned by `getUploadedReports()`. If there are no crash reports at all,
     * `null` is returned.
     *
     * If no report has been uploaded yet but some are stored on disk, a report that
     * has not been uploaded may be returned. Check that its `id` is not empty before
     * treating it as uploaded.
     *
     * > [!NOTE] This method is only available in the main process.
     */
    fun getLastCrashReport(): CrashReport?

    /**
     * The current 'extra' parameters of the crash reporter in the calling process, as
     * set with the `extra` option and `addExtraParameter`. Parameters set with the
     * `globalExtra` option are not included.
     */
    fun getParameters(): js.objects.ReadonlyRecord<String, String>

    /**
     * Returns the crash reports stored on disk. Each report contains the date it was
     * uploaded and the ID that the crash server returned for it.
     *
     * Despite the method's name, reports that have not been uploaded (for example
     * because `uploadToServer` is `false`, the upload failed, or the report was rate
     * limited) are included too. For those reports, `id` is an empty string and `date`
     * is not meaningful. To list only uploaded reports, filter out reports with an
     * empty `id`.
     *
     * > [!NOTE] This method is only available in the main process.
     */
    fun getUploadedReports(): js.array.ReadonlyArray<CrashReport>

    /**
     * Whether reports should be submitted to the server. Set through the `start`
     * method or `setUploadToServer`.
     *
     * > [!NOTE] This method is only available in the main process.
     */
    fun getUploadToServer(): Boolean

    /**
     * Remove an extra parameter from the current set of parameters. Future crashes
     * will not include this parameter.
     */
    fun removeExtraParameter(key: String)

    /**
     * This would normally be controlled by user preferences. This has no effect if
     * called before `start` is called.
     *
     * > [!NOTE] This method is only available in the main process.
     */
    fun setUploadToServer(uploadToServer: Boolean)

    /**
     * This method must be called before using any other `crashReporter` APIs. Once
     * initialized this way, the crashpad handler collects crashes from all
     * subsequently created processes. The crash reporter cannot be disabled once
     * started.
     *
     * This method should be called as early as possible in app startup, preferably
     * before `app.on('ready')`. If the crash reporter is not initialized at the time a
     * renderer process is created, then that renderer process will not be monitored by
     * the crash reporter.
     *
     * > [!NOTE] You can test out the crash reporter by generating a crash using
     * `process.crash()`.
     *
     * > [!NOTE] If you need to send additional/updated `extra` parameters after your
     * first call `start` you can call `addExtraParameter`.
     *
     * > [!NOTE] Parameters passed in `extra`, `globalExtra` or set with
     * `addExtraParameter` have limits on the length of the keys and values. Key names
     * must be at most 39 bytes long, and values must be no longer than 20320 bytes.
     * Keys with names longer than the maximum are ignored, and a warning is emitted.
     * Values longer than the maximum length are truncated.
     *
     * > [!NOTE] This method is only available in the main process.
     */
    fun start(options: CrashReporterStartOptions)
}
