// Automatically generated - do not modify!

package tauri.apps.api.tray

import tauri.apps.api.image.JsImage

/** {@link TrayIcon.new|`TrayIcon`} creation options */
external interface TrayIconOptions {
    /** The tray icon id. If undefined, a random one will be assigned */
    var id: String?

    /** The tray icon menu */
    var menu: (Any /* Menu | Submenu */)?

    /**
     * The tray icon which could be icon bytes or path to the icon file.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    var icon: JsImage?

    /** The tray icon tooltip */
    var tooltip: String?

    /**
     * The tray title
     *
     * #### Platform-specific
     *
     * - **Linux:** The title will not be shown unless there is an icon
     * as well.  The title is useful for numerical and other frequently
     * updated information.  In general, it shouldn't be shown unless a
     * user requests it as it can take up a significant amount of space
     * on the user's panel.  This may not be shown in all visualizations.
     * - **Windows:** Unsupported.
     */
    var title: String?

    /**
     * The tray icon temp dir path. **Linux only**.
     *
     * On Linux, we need to write the icon to the disk and usually it will
     * be `$XDG_RUNTIME_DIR/tray-icon` or `$TEMP/tray-icon`.
     */
    var tempDirPath: String?

    /**
     * Use the icon as a [template](https://developer.apple.com/documentation/appkit/nsimage/1520017-template?language=objc). **macOS only**.
     */
    var iconAsTemplate: Boolean?

    /**
     * Whether to show the tray menu on left click or not, default is `true`.
     *
     * #### Platform-specific:
     *
     * - **Linux**: Unsupported.
     *
     * @since 2.2.0
     */
    var showMenuOnLeftClick: Boolean?

    /** A handler for an event on the tray icon. */
    var action: ((event: TrayIconEvent) -> Unit)?
}
