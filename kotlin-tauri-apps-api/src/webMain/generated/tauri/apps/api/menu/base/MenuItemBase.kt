// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/base")

package tauri.apps.api.menu.base

import tauri.apps.api.core.Resource

/**
 * The base class of every menu and menu item type.
 *
 * It is not constructible on its own: create a {@linkcode Menu}, {@linkcode Submenu},
 * {@linkcode MenuItem}, {@linkcode CheckMenuItem}, {@linkcode IconMenuItem} or
 * {@linkcode PredefinedMenuItem} instead. It provides the `id` shared by all of
 * them and, through {@linkcode Resource}, the `rid` and `close()` used to release
 * the Rust-side object.
 */
open external class MenuItemBase : Resource {
    /** @ignore */
    constructor (rid: Double, id: String, kind: ItemKind)

    /** The id of this item. */
    val id: String

    /** @ignore */
    val kind: String
}
