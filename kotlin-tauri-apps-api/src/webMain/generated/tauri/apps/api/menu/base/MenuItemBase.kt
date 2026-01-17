// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/base")

package tauri.apps.api.menu.base

import tauri.apps.api.core.Resource

open external class MenuItemBase : Resource {
    /** @ignore */
    constructor (rid: Double, id: String, kind: ItemKind)

    /** The id of this item. */
    val id: String

    /** @ignore */
    val kind: String
}
