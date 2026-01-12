// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: Menu from "./menu"
// unhandled import: Submenu from "./menu"
// unhandled import: Resource from "./core"
// unhandled import: Image from "./image"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"

/**
 * Tray icon class and associated methods. This type constructor is private,
 * instead, you should use the static method {@linkcode TrayIcon.new}.
 *
 * #### Warning
 *
 * Unlike Rust, javascript does not have any way to run cleanup code
 * when an object is being removed by garbage collection, but this tray icon
 * will be cleaned up when the tauri app exists, however if you want to cleanup
 * this object early, you need to call {@linkcode TrayIcon.close}.
 *
 * @example
 * ```ts
 * import { TrayIcon } from '@tauri-apps/api/tray';
 * const tray = await TrayIcon.new({ tooltip: 'awesome tray tooltip' });
 * tray.set_tooltip('new tooltip');
 * ```
 */
external class TrayIcon : Resource {
    /** The id associated with this tray icon.   */
    var id: String

    /**
     *  Sets a new tray icon. If `null` is provided, it will remove the icon.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    fun setIcon(icon: String?): js.promise.Promise<js.core.Void>

    /**
     *  Sets a new tray icon. If `null` is provided, it will remove the icon.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    fun setIcon(icon: Image?): js.promise.Promise<js.core.Void>

    /**
     *  Sets a new tray icon. If `null` is provided, it will remove the icon.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    fun setIcon(icon: js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>?): js.promise.Promise<js.core.Void>

    /**
     *  Sets a new tray icon. If `null` is provided, it will remove the icon.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    fun setIcon(icon: js.buffer.ArrayBuffer?): js.promise.Promise<js.core.Void>

    /**
     *  Sets a new tray icon. If `null` is provided, it will remove the icon.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    fun setIcon(icon: js.array.ReadonlyArray<Double>?): js.promise.Promise<js.core.Void>

    /**
     * Sets a new tray menu.
     *
     * #### Platform-specific:
     *
     * - **Linux**: once a menu is set it cannot be removed so `null` has no effect
     */
    fun setMenu(menu: tauri.apps.api.menu.Menu?): js.promise.Promise<js.core.Void>

    /**
     * Sets a new tray menu.
     *
     * #### Platform-specific:
     *
     * - **Linux**: once a menu is set it cannot be removed so `null` has no effect
     */
    fun setMenu(menu: tauri.apps.api.menu.Submenu?): js.promise.Promise<js.core.Void>

    /**
     * Sets the tooltip for this tray icon.
     *
     * #### Platform-specific:
     *
     * - **Linux:** Unsupported
     */
    fun setTooltip(tooltip: String?): js.promise.Promise<js.core.Void>

    /**
     * Sets the tooltip for this tray icon.
     *
     * #### Platform-specific:
     *
     * - **Linux:** The title will not be shown unless there is an icon
     * as well.  The title is useful for numerical and other frequently
     * updated information.  In general, it shouldn't be shown unless a
     * user requests it as it can take up a significant amount of space
     * on the user's panel.  This may not be shown in all visualizations.
     * - **Windows:** Unsupported
     */
    fun setTitle(title: String?): js.promise.Promise<js.core.Void>

    /** Show or hide this tray icon. */
    fun setVisible(visible: Boolean): js.promise.Promise<js.core.Void>

    /**
     * Sets the tray icon temp dir path. **Linux only**.
     *
     * On Linux, we need to write the icon to the disk and usually it will
     * be `$XDG_RUNTIME_DIR/tray-icon` or `$TEMP/tray-icon`.
     */
    fun setTempDirPath(path: String?): js.promise.Promise<js.core.Void>

    /** Sets the current icon as a [template](https://developer.apple.com/documentation/appkit/nsimage/1520017-template?language=objc). **macOS only** */
    fun setIconAsTemplate(asTemplate: Boolean): js.promise.Promise<js.core.Void>

    /**
     *  Disable or enable showing the tray menu on left click.
     *
     * #### Platform-specific:
     *
     * - **Linux**: Unsupported.
     *
     * @deprecated use {@linkcode TrayIcon.setShowMenuOnLeftClick} instead.
     */
    fun setMenuOnLeftClick(onLeft: Boolean): js.promise.Promise<js.core.Void>

    /**
     *  Disable or enable showing the tray menu on left click.
     *
     * #### Platform-specific:
     *
     * - **Linux**: Unsupported.
     *
     * @since 2.2.0
     */
    fun setShowMenuOnLeftClick(onLeft: Boolean): js.promise.Promise<js.core.Void>

    companion object {
        /** Gets a tray icon using the provided id. */
        fun getById(id: String): js.promise.Promise<TrayIcon?>

        /**
         * Removes a tray icon using the provided id from tauri's internal state.
         *
         * Note that this may cause the tray icon to disappear
         * if it wasn't cloned somewhere else or referenced by JS.
         */
        fun removeById(id: String): js.promise.Promise<js.core.Void>

        /**
         * Creates a new {@linkcode TrayIcon}
         *
         * #### Platform-specific:
         *
         * - **Linux:** Sometimes the icon won't be visible unless a menu is set.
         * Setting an empty {@linkcode Menu} is enough.
         */
        fun new(options: TrayIconOptions = definedExternally): js.promise.Promise<TrayIcon>
    }
}
