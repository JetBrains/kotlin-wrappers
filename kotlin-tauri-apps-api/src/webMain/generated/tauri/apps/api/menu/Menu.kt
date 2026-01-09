// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api.menu

// unhandled import: MenuItemOptions from "../menu"
// unhandled import: SubmenuOptions from "../menu"
// unhandled import: IconMenuItemOptions from "../menu"
// unhandled import: PredefinedMenuItemOptions from "../menu"
// unhandled import: CheckMenuItemOptions from "../menu"
// unhandled import: MenuItem from "./menuItem"
// unhandled import: CheckMenuItem from "./checkMenuItem"
// unhandled import: IconMenuItem from "./iconMenuItem"
// unhandled import: PredefinedMenuItem from "./predefinedMenuItem"
// unhandled import: Submenu from "./submenu"
// unhandled import: LogicalPosition from "../dpi"
// unhandled import: PhysicalPosition from "../dpi"
// unhandled import: Position from "../dpi"
// unhandled import: Window from "../window"
// unhandled import: MenuItemBase from "./base"

/** A type that is either a menu bar on the window
 * on Windows and Linux or as a global menu in the menubar on macOS.
 *
 * #### Platform-specific:
 *
 * - **macOS**: if using {@linkcode Menu} for the global menubar, it can only contain {@linkcode Submenu}s.
 */
open external class Menu : MenuItemBase {
    /** @ignore */
    constructor (rid: Double, id: String)

    /**
     * Add a menu item to the end of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> append(
        items: T,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the end of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> append(
        items: js.array.ReadonlyArray<T>,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the beginning of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> prepend(
        items: T,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the beginning of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> prepend(
        items: js.array.ReadonlyArray<T>,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the specified position in this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> insert(
        items: T,
        position: Double,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the specified position in this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> insert(
        items: js.array.ReadonlyArray<T>,
        position: Double,
    ): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: tauri.apps.api.menu.Submenu): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: MenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: PredefinedMenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: CheckMenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: IconMenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this menu at the specified position. */
    fun removeAt(
        position: Double,
    ): js.promise.Promise<Any? /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | null */>

    /** Returns a list of menu items that has been added to this menu. */
    fun items(): js.promise.Promise<js.array.ReadonlyArray<Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem */>>

    /** Retrieves the menu item matching the given identifier. */
    fun get(
        id: String,
    ): js.promise.Promise<Any? /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | null */>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     */
    fun popup(): js.promise.Promise<js.core.Void>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     */
    fun popup(
        at: tauri.apps.api.PhysicalPosition = definedExternally,
        window: tauri.apps.api.Window = definedExternally,
    ): js.promise.Promise<js.core.Void>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     */
    fun popup(
        at: tauri.apps.api.LogicalPosition = definedExternally,
        window: tauri.apps.api.Window = definedExternally,
    ): js.promise.Promise<js.core.Void>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     */
    fun popup(
        at: tauri.apps.api.Position = definedExternally,
        window: tauri.apps.api.Window = definedExternally,
    ): js.promise.Promise<js.core.Void>

    /**
     * Sets the app-wide menu and returns the previous one.
     *
     * If a window was not created with an explicit menu or had one set explicitly,
     * this menu will be assigned to it.
     */
    fun setAsAppMenu(): js.promise.Promise<tauri.apps.api.menu.Menu?>

    /**
     * Sets the window menu and returns the previous one.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Unsupported. The menu on macOS is app-wide and not specific to one
     * window, if you need to set it, use {@linkcode Menu.setAsAppMenu} instead.
     */
    fun setAsWindowMenu(window: tauri.apps.api.Window = definedExternally): js.promise.Promise<tauri.apps.api.menu.Menu?>

    companion object {
        /** Create a new menu. */
        fun new(opts: MenuOptions = definedExternally): js.promise.Promise<tauri.apps.api.menu.Menu>

        /** Create a default menu. */
        fun default(): js.promise.Promise<tauri.apps.api.menu.Menu>
    }
}
