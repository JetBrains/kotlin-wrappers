// Automatically generated - do not modify!

package tauri.apps.api.menu.base

sealed external interface ItemKind {
    companion object
}

inline val ItemKind.Companion.MenuItem: ItemKind
    get() = js.reflect.unsafeCast("MenuItem")

inline val ItemKind.Companion.Predefined: ItemKind
    get() = js.reflect.unsafeCast("Predefined")

inline val ItemKind.Companion.Check: ItemKind
    get() = js.reflect.unsafeCast("Check")

inline val ItemKind.Companion.Icon: ItemKind
    get() = js.reflect.unsafeCast("Icon")

inline val ItemKind.Companion.Submenu: ItemKind
    get() = js.reflect.unsafeCast("Submenu")

inline val ItemKind.Companion.Menu: ItemKind
    get() = js.reflect.unsafeCast("Menu")
