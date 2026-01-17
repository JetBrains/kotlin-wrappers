// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/predefinedMenuItem")

package tauri.apps.api.menu

import tauri.apps.api.menu.base.MenuItemBase

/** A predefined (native) menu item which has a predefined behavior by the OS or by tauri.  */
external class PredefinedMenuItem : MenuItemBase {
    /** @ignore */
    constructor (rid: Double, id: String)

    /** Returns the text of this predefined menu item. */
    fun text(): js.promise.Promise<String>

    /** Sets the text for this predefined menu item. */
    fun setText(text: String): js.promise.Promise<js.core.Void>

    companion object {
        /** Create a new predefined menu item. */
        fun new(opts: PredefinedMenuItemOptions = definedExternally): js.promise.Promise<PredefinedMenuItem>
    }
}
