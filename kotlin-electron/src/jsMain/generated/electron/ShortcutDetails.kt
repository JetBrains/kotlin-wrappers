package electron


external interface ShortcutDetails {
// Docs: https://electronjs.org/docs/api/structures/shortcut-details
    /**
     * The Application User Model ID. Default is empty.
     */
    var appUserModelId: String?

    /**
     * The arguments to be applied to `target` when launching from this shortcut.
     * Default is empty.
     */
    var args: String?

    /**
     * The working directory. Default is empty.
     */
    var cwd: String?

    /**
     * The description of the shortcut. Default is empty.
     */
    var description: String?

    /**
     * The path to the icon, can be a DLL or EXE. `icon` and `iconIndex` have to be set
     * together. Default is empty, which uses the target's icon.
     */
    var icon: String?

    /**
     * The resource ID of icon when `icon` is a DLL or EXE. Default is 0.
     */
    var iconIndex: Double?

    /**
     * The target to launch from this shortcut.
     */
    var target: String

    /**
     * The Application Toast Activator CLSID. Needed for participating in Action
     * Center.
     */
    var toastActivatorClsid: String?
}
