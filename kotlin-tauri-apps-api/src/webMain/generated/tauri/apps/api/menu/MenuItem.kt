// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/menuItem")

package tauri.apps.api.menu

import tauri.apps.api.menu.base.MenuItemBase

/** A menu item inside a {@linkcode Menu} or {@linkcode Submenu} and contains only text. */
external class MenuItem : MenuItemBase {
    /** @ignore */
    constructor (rid: Double, id: String)

    /** Returns the text of this menu item. */
    fun text(): js.promise.Promise<String>

    /** Sets the text for this menu item. */
    fun setText(text: String): js.promise.Promise<js.core.Void>

    /** Returns whether this menu item is enabled or not. */
    fun isEnabled(): js.promise.Promise<Boolean>

    /** Sets whether this menu item is enabled or not. */
    fun setEnabled(enabled: Boolean): js.promise.Promise<js.core.Void>

    /** Sets the accelerator for this menu item. */
    fun setAccelerator(accelerator: String?): js.promise.Promise<js.core.Void>

    companion object {
        /** Create a new menu item. */
        fun new(opts: MenuItemOptions): js.promise.Promise<MenuItem>
    }
}
