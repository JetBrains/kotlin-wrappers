package electron.core


external interface AppDetailsOptions {
    /**
     * Window's App User Model ID. It has to be set, otherwise the other options will
     * have no effect.
     */
    var appId: String?

    /**
     * Window's Relaunch Icon.
     */
    var appIconPath: String?

    /**
     * Index of the icon in `appIconPath`. Ignored when `appIconPath` is not set.
     * Default is `0`.
     */
    var appIconIndex: Double?

    /**
     * Window's Relaunch Command.
     */
    var relaunchCommand: String?

    /**
     * Window's Relaunch Display Name.
     */
    var relaunchDisplayName: String?
}
