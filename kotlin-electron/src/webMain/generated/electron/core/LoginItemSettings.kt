// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface LoginItemSettings {
    /**
     * `true` if the app is set to open at login.
     */
    var openAtLogin: Boolean

    /**
     * `true` if the app was opened at login automatically.
     *
     * @platform darwin
     */
    var wasOpenedAtLogin: Boolean

    /**
     * can be `not-registered`, `enabled`, `requires-approval`, or `not-found`.
     *
     * @platform darwin
     */
    var status: (LoginItemSettingsStatus)

    /**
     * `true` if app is set to open at login and its run key is not deactivated. This
     * differs from `openAtLogin` as it ignores the `args` option, this property will
     * be true if the given executable would be launched at login with **any**
     * arguments.
     *
     * @platform win32
     */
    var executableWillLaunchAtLogin: Boolean
    var launchItems: js.array.ReadonlyArray<LaunchItems>
}
