// Automatically generated - do not modify!

package tauri.apps.api.menu


/** Options for creating a new menu. */
external interface MenuOptions {
    /** Specify an id to use for the new menu. */
    var id: String?

    /** List of items to add to the new menu. */
    var items:
            js.array.ReadonlyArray<Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */>?
}
