// Automatically generated - do not modify!

package tauri.apps.api.menu


/** Options for creating a new menu item. */
external interface MenuItemOptions {
    /** Specify an id to use for the new menu item. */
    var id: String?

    /** The text of the new menu item. */
    var text: String

    /** Whether the new menu item is enabled or not. */
    var enabled: Boolean?

    /** Specify an accelerator for the new menu item. */
    var accelerator: String?

    /** Specify a handler to be called when this menu item is activated. */
    var action: ((id: String) -> Unit)?
}
