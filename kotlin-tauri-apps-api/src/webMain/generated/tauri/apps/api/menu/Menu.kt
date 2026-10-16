// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/menu")

package tauri.apps.api.menu

import tauri.apps.api.dpi.LogicalPosition
import tauri.apps.api.dpi.PhysicalPosition
import tauri.apps.api.dpi.Position
import tauri.apps.api.menu.base.MenuItemBase
import tauri.apps.api.window.Window

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
    ): js.promise.Promise<js.void.Void>

    /**
     * Add a menu item to the end of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> append(
        items: js.array.ReadonlyArray<T>,
    ): js.promise.Promise<js.void.Void>

    /**
     * Add a menu item to the beginning of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> prepend(
        items: T,
    ): js.promise.Promise<js.void.Void>

    /**
     * Add a menu item to the beginning of this menu.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Only {@linkcode Submenu}s can be added to a {@linkcode Menu}.
     */
    fun <T : Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */> prepend(
        items: js.array.ReadonlyArray<T>,
    ): js.promise.Promise<js.void.Void>

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
    ): js.promise.Promise<js.void.Void>

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
    ): js.promise.Promise<js.void.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: Submenu): js.promise.Promise<js.void.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: MenuItem): js.promise.Promise<js.void.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: PredefinedMenuItem): js.promise.Promise<js.void.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: CheckMenuItem): js.promise.Promise<js.void.Void>

    /** Remove a menu item from this menu. */
    fun remove(item: IconMenuItem): js.promise.Promise<js.void.Void>

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
     * Call it from a `contextmenu` DOM listener (and `preventDefault()` on the event)
     * to replace the webview context menu with a native one. The promise resolves as
     * soon as the menu is shown, not when an item is picked: use each item's `action`
     * handler for that.
     *
     * @example
     * ```typescript
     * import { Menu } from '@tauri-apps/api/menu';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     *
     * const menu = await Menu.new({
     *   items: [{ id: 'copy', text: 'Copy', action: () => console.log('copy') }]
     * });
     *
     * document.addEventListener('contextmenu', (event) => {
     *   event.preventDefault();
     *   void menu.popup(new LogicalPosition(event.clientX, event.clientY));
     * });
     * ```
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     * @param window The window to show the menu on. Defaults to the current window.
     */
    fun popup(): js.promise.Promise<js.void.Void>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * Call it from a `contextmenu` DOM listener (and `preventDefault()` on the event)
     * to replace the webview context menu with a native one. The promise resolves as
     * soon as the menu is shown, not when an item is picked: use each item's `action`
     * handler for that.
     *
     * @example
     * ```typescript
     * import { Menu } from '@tauri-apps/api/menu';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     *
     * const menu = await Menu.new({
     *   items: [{ id: 'copy', text: 'Copy', action: () => console.log('copy') }]
     * });
     *
     * document.addEventListener('contextmenu', (event) => {
     *   event.preventDefault();
     *   void menu.popup(new LogicalPosition(event.clientX, event.clientY));
     * });
     * ```
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     * @param window The window to show the menu on. Defaults to the current window.
     */
    fun popup(
        at: PhysicalPosition = definedExternally,
        window: Window = definedExternally,
    ): js.promise.Promise<js.void.Void>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * Call it from a `contextmenu` DOM listener (and `preventDefault()` on the event)
     * to replace the webview context menu with a native one. The promise resolves as
     * soon as the menu is shown, not when an item is picked: use each item's `action`
     * handler for that.
     *
     * @example
     * ```typescript
     * import { Menu } from '@tauri-apps/api/menu';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     *
     * const menu = await Menu.new({
     *   items: [{ id: 'copy', text: 'Copy', action: () => console.log('copy') }]
     * });
     *
     * document.addEventListener('contextmenu', (event) => {
     *   event.preventDefault();
     *   void menu.popup(new LogicalPosition(event.clientX, event.clientY));
     * });
     * ```
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     * @param window The window to show the menu on. Defaults to the current window.
     */
    fun popup(
        at: LogicalPosition = definedExternally,
        window: Window = definedExternally,
    ): js.promise.Promise<js.void.Void>

    /**
     * Popup this menu as a context menu on the specified window.
     *
     * Call it from a `contextmenu` DOM listener (and `preventDefault()` on the event)
     * to replace the webview context menu with a native one. The promise resolves as
     * soon as the menu is shown, not when an item is picked: use each item's `action`
     * handler for that.
     *
     * @example
     * ```typescript
     * import { Menu } from '@tauri-apps/api/menu';
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     *
     * const menu = await Menu.new({
     *   items: [{ id: 'copy', text: 'Copy', action: () => console.log('copy') }]
     * });
     *
     * document.addEventListener('contextmenu', (event) => {
     *   event.preventDefault();
     *   void menu.popup(new LogicalPosition(event.clientX, event.clientY));
     * });
     * ```
     *
     * @param at If a position is provided, it is relative to the window's top-left corner.
     * If there isn't one provided, the menu will pop up at the current location of the mouse.
     * @param window The window to show the menu on. Defaults to the current window.
     */
    fun popup(
        at: Position = definedExternally,
        window: Window = definedExternally,
    ): js.promise.Promise<js.void.Void>

    /**
     * Sets the app-wide menu and returns the previous one.
     *
     * If a window was not created with an explicit menu or had one set explicitly,
     * this menu will be assigned to it.
     *
     * This is the menu bar shown at the top of the screen on macOS. On Windows and
     * Linux, where menus belong to a window, use {@linkcode Menu.setAsWindowMenu}
     * to target one window instead.
     *
     * @example
     * ```typescript
     * import { Menu } from '@tauri-apps/api/menu';
     *
     * await using menu = await Menu.default();
     * const previous = await menu.setAsAppMenu();
     * await previous?.close();
     * ```
     *
     * @returns The menu that was set before this call, or `null` if there was none.
     */
    fun setAsAppMenu(): js.promise.Promise<Menu?>

    /**
     * Sets the window menu and returns the previous one.
     *
     * #### Platform-specific:
     *
     * - **macOS:** Unsupported. The menu on macOS is app-wide and not specific to one
     * window, if you need to set it, use {@linkcode Menu.setAsAppMenu} instead.
     *
     * @example
     * ```typescript
     * import { Menu } from '@tauri-apps/api/menu';
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     *
     * await using menu = await Menu.default();
     * await menu.setAsWindowMenu(getCurrentWindow());
     * ```
     *
     * @param window The window to set the menu on. Defaults to the current window.
     * @returns The menu that was set on that window before this call, or `null` if there was none.
     */
    fun setAsWindowMenu(window: Window = definedExternally): js.promise.Promise<Menu?>

    companion object {
        /**
         * Create a new menu.
         *
         * @example
         * ```typescript
         * import { Menu } from '@tauri-apps/api/menu';
         *
         * const menu = await Menu.new({
         *   items: [
         *     {
         *       text: 'File',
         *       items: [
         *         { id: 'open', text: 'Open', accelerator: 'CmdOrCtrl+O', action: () => console.log('open') },
         *         { item: 'Separator' },
         *         { item: 'Quit' }
         *       ]
         *     }
         *   ]
         * });
         * ```
         */
        fun new(opts: MenuOptions = definedExternally): js.promise.Promise<Menu>

        /**
         * Create the default application menu, the same one Tauri installs when no menu
         * is configured.
         *
         * It contains an `Edit` submenu (undo, redo, cut, copy, paste, select all), a
         * `Window` submenu (minimize, maximize, close window) and a `Help` submenu, plus:
         *
         * - **macOS:** an application submenu named after your app (about, services,
         *   hide, hide others, quit) and a `View` submenu with the fullscreen item.
         * - **Windows:** a `File` submenu with close window and quit; the about item
         *   lives in `Help`.
         * - **Linux:** no `File` submenu; the about item lives in `Help`.
         *
         * Useful as a starting point you then extend with {@linkcode Menu.append},
         * {@linkcode Menu.insert} or {@linkcode Menu.prepend}.
         *
         * @example
         * ```typescript
         * import { Menu } from '@tauri-apps/api/menu';
         *
         * await using menu = await Menu.default();
         * await menu.append({ text: 'Tools', items: [{ id: 'fmt', text: 'Format' }] });
         * await menu.setAsAppMenu();
         * ```
         */
        fun default(): js.promise.Promise<Menu>
    }
}
