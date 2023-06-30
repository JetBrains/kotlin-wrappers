package electron.core


external interface Settings {
    /**
     * `true` to open the app at login, `false` to remove the app as a login item.
     * Defaults to `false`.
     */
    var openAtLogin: Boolean?

    /**
     * `true` to open the app as hidden. Defaults to `false`. The user can edit this
     * setting from the System Preferences so
     * `app.getLoginItemSettings().wasOpenedAsHidden` should be checked when the app is
     * opened to know the current value. This setting is not available on MAS builds.
     *
     * @platform darwin
     */
    var openAsHidden: Boolean?

    /**
     * The executable to launch at login. Defaults to `process.execPath`.
     *
     * @platform win32
     */
    var path: String?

    /**
     * The command-line arguments to pass to the executable. Defaults to an empty
     * array. Take care to wrap paths in quotes.
     *
     * @platform win32
     */
    var args: js.core.ReadonlyArray<String>?

    /**
     * `true` will change the startup approved registry key and `enable / disable` the
     * App in Task Manager and Windows Settings. Defaults to `true`.
     *
     * @platform win32
     */
    var enabled: Boolean?

    /**
     * value name to write into registry. Defaults to the app's AppUserModelId(). Set
     * the app's login item settings.
     *
     * @platform win32
     */
    var name: String?
}
