// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface LoginItemSettingsOptions {
    /**
     * Can be `mainAppService`, `agentService`, `daemonService`, or `loginItemService`.
     * Defaults to `mainAppService`. Only available on macOS 13 and up. See
     * app.setLoginItemSettings for more information about each type.
     *
     * @platform darwin
     */
    var type: (LoginItemSettingsOptionsType)?

    /**
     * The name of the service. Required if `type` is non-default. Only available on
     * macOS 13 and up.
     *
     * @platform darwin
     */
    var serviceName: String?

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
    var args: js.array.ReadonlyArray<String>?
}
