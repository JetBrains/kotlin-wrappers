// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api.menu

// unhandled import: MenuItemBase from "./base"
// unhandled import: MenuItemOptions from "../menu"

/**
 * A check menu item inside a {@linkcode Menu} or {@linkcode Submenu}
 * and usually contains a text and a check mark or a similar toggle
 * that corresponds to a checked and unchecked states.
 */
external class CheckMenuItem : MenuItemBase {
    /** @ignore */
    constructor (rid: Double, id: String)

    /** Returns the text of this check menu item. */
    fun text(): js.promise.Promise<String>

    /** Sets the text for this check menu item. */
    fun setText(text: String): js.promise.Promise<js.core.Void>

    /** Returns whether this check menu item is enabled or not. */
    fun isEnabled(): js.promise.Promise<Boolean>

    /** Sets whether this check menu item is enabled or not. */
    fun setEnabled(enabled: Boolean): js.promise.Promise<js.core.Void>

    /** Sets the accelerator for this check menu item. */
    fun setAccelerator(accelerator: String?): js.promise.Promise<js.core.Void>

    /** Returns whether this check menu item is checked or not. */
    fun isChecked(): js.promise.Promise<Boolean>

    /** Sets whether this check menu item is checked or not. */
    fun setChecked(checked: Boolean): js.promise.Promise<js.core.Void>

    companion object {
        /** Create a new check menu item. */
        fun new(opts: CheckMenuItemOptions): js.promise.Promise<CheckMenuItem>
    }
}
