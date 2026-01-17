// Automatically generated - do not modify!

package tauri.apps.api.menu.base

sealed external interface ItemKind {
    companion object {
        @seskar.js.JsValue("MenuItem")
        val MenuItem: ItemKind

        @seskar.js.JsValue("Predefined")
        val Predefined: ItemKind

        @seskar.js.JsValue("Check")
        val Check: ItemKind

        @seskar.js.JsValue("Icon")
        val Icon: ItemKind

        @seskar.js.JsValue("Submenu")
        val Submenu: ItemKind

        @seskar.js.JsValue("Menu")
        val Menu: ItemKind
    }
}
