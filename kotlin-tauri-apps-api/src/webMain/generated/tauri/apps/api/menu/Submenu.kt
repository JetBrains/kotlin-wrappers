// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api.menu

// unhandled import: IconMenuItemOptions from "../menu"
// unhandled import: PredefinedMenuItemOptions from "../menu"
// unhandled import: CheckMenuItemOptions from "../menu"
// unhandled import: MenuItem from "./menuItem"
// unhandled import: MenuItemOptions from "./menuItem"
// unhandled import: CheckMenuItem from "./checkMenuItem"
// unhandled import: IconMenuItem from "./iconMenuItem"
// unhandled import: PredefinedMenuItem from "./predefinedMenuItem"
// unhandled import: LogicalPosition from "../window"
// unhandled import: PhysicalPosition from "../window"
// unhandled import: Window from "../window"
// unhandled import: ItemKind from "./base"
// unhandled import: MenuItemBase from "./base"
// unhandled import: MenuOptions from "./menu"
// unhandled import: MenuIcon from "../image"

/** A type that is a submenu inside a {@linkcode Menu} or {@linkcode Submenu}. */
open external class Submenu : MenuItemBase {
    /** @ignore */
    constructor (rid: Double, id: String)

    /** Returns the text of this submenu. */
    fun text(): js.promise.Promise<String>

    /** Sets the text for this submenu. */
    fun setText(text: String): js.promise.Promise<js.core.Void>

    /** Returns whether this submenu is enabled or not. */
    fun isEnabled(): js.promise.Promise<Boolean>

    /** Sets whether this submenu is enabled or not. */
    fun setEnabled(enabled: Boolean): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the end of this submenu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> append(
        items: T,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the end of this submenu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> append(
        items: js.array.ReadonlyArray<T>,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the beginning of this submenu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> prepend(
        items: T,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the beginning of this submenu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> prepend(
        items: js.array.ReadonlyArray<T>,
    ): js.promise.Promise<js.core.Void>

    /**
     * Add a menu item to the specified position in this submenu.
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
     * Add a menu item to the specified position in this submenu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> insert(
        items: js.array.ReadonlyArray<T>,
        position: Double,
    ): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this submenu. */
    fun remove(item: Submenu): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this submenu. */
    fun remove(item: MenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this submenu. */
    fun remove(item: PredefinedMenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this submenu. */
    fun remove(item: CheckMenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this submenu. */
    fun remove(item: IconMenuItem): js.promise.Promise<js.core.Void>

    /** Remove a menu item from this submenu at the specified position. */
    fun removeAt(
        position: Double,
    ): js.promise.Promise<Any? /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | null */>

    /** Returns a list of menu items that has been added to this submenu. */
    fun items(): js.promise.Promise<js.array.ReadonlyArray<Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem */>>

    /** Retrieves the menu item matching the given identifier. */
    fun get(
        id: String,
    ): js.promise.Promise<Any? /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | null */>

    /**
     * Popup this submenu as a context menu on the specified window.
     *
     * If the position, is provided, it is relative to the window's top-left corner.
     */
    fun popup(): js.promise.Promise<js.core.Void>

    /**
     * Popup this submenu as a context menu on the specified window.
     *
     * If the position, is provided, it is relative to the window's top-left corner.
     */
    fun popup(
        at: tauri.apps.api.PhysicalPosition = definedExternally,
        window: tauri.apps.api.Window = definedExternally,
    ): js.promise.Promise<js.core.Void>

    /**
     * Popup this submenu as a context menu on the specified window.
     *
     * If the position, is provided, it is relative to the window's top-left corner.
     */
    fun popup(
        at: tauri.apps.api.LogicalPosition = definedExternally,
        window: tauri.apps.api.Window = definedExternally,
    ): js.promise.Promise<js.core.Void>

    /**
     * Set this submenu as the Window menu for the application on macOS.
     *
     * This will cause macOS to automatically add window-switching items and
     * certain other items to the menu.
     *
     * #### Platform-specific:
     *
     * - **Windows / Linux**: Unsupported.
     */
    fun setAsWindowsMenuForNSApp(): js.promise.Promise<js.core.Void>

    /**
     * Set this submenu as the Help menu for the application on macOS.
     *
     * This will cause macOS to automatically add a search box to the menu.
     *
     * If no menu is set as the Help menu, macOS will automatically use any menu
     * which has a title matching the localized word "Help".
     *
     * #### Platform-specific:
     *
     * - **Windows / Linux**: Unsupported.
     */
    fun setAsHelpMenuForNSApp(): js.promise.Promise<js.core.Void>

    /** Sets an icon for this submenu */
    fun setIcon(icon: tauri.apps.api.MenuIcon?): js.promise.Promise<js.core.Void>

    companion object {
        /** Create a new submenu. */
        fun new(opts: SubmenuOptions): js.promise.Promise<Submenu>
    }
}
