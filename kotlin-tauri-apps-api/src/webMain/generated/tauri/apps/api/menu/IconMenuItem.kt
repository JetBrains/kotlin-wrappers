// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api.menu


/**
 * An icon menu item inside a {@linkcode Menu} or {@linkcode Submenu}
 * and usually contains an icon and a text.
 */
external class IconMenuItem : MenuItemBase {
    /** @ignore */
    constructor (rid: Double, id: String)

    /** Returns the text of this icon menu item. */
    fun text(): js.promise.Promise<String>

    /** Sets the text for this icon menu item. */
    fun setText(text: String): js.promise.Promise<js.core.Void>

    /** Returns whether this icon menu item is enabled or not. */
    fun isEnabled(): js.promise.Promise<Boolean>

    /** Sets whether this icon menu item is enabled or not. */
    fun setEnabled(enabled: Boolean): js.promise.Promise<js.core.Void>

    /** Sets the accelerator for this icon menu item. */
    fun setAccelerator(accelerator: String?): js.promise.Promise<js.core.Void>

    /** Sets an icon for this icon menu item */
    fun setIcon(icon: tauri.apps.api.MenuIcon?): js.promise.Promise<js.core.Void>

    companion object {
        /** Create a new icon menu item. */
        fun new(opts: IconMenuItemOptions): js.promise.Promise<IconMenuItem>
    }
}
