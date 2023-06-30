package electron.core


external interface LoginItemSettingsOptions {
    /**
     * The executable path to compare against. Defaults to `process.execPath`.
     *
     * @platform win32
     */
    var path: String?

    /**
     * The command-line arguments to compare against. Defaults to an empty array.
     *
     * @platform win32
     */
    var args: js.core.ReadonlyArray<String>?
}
