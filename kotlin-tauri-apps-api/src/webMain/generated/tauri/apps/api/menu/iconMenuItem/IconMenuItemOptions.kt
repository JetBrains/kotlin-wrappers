// Automatically generated - do not modify!

package tauri.apps.api.menu.iconMenuItem

import tauri.apps.api.image.MenuIcon
import tauri.apps.api.menu.menuItem.MenuItemOptions

/** Options for creating a new icon menu item. */
external interface IconMenuItemOptions : MenuItemOptions {
    /**
     * Icon to be used for the new icon menu item.
     *
     * Note that you may need the `image-ico` or `image-png` Cargo features to use this API.
     * To enable it, change your Cargo.toml file:
     * ```toml
     * [dependencies]
     * tauri = { version = "...", features = ["...", "image-png"] }
     * ```
     */
    var icon: MenuIcon?
}
