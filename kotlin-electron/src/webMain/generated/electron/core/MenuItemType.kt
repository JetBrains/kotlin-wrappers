// Automatically generated - do not modify!

package electron.core

sealed external interface MenuItemType {
    companion object
}

inline val MenuItemType.Companion.normal: MenuItemType
    get() = js.reflect.unsafeCast("normal")

inline val MenuItemType.Companion.separator: MenuItemType
    get() = js.reflect.unsafeCast("separator")

inline val MenuItemType.Companion.submenu: MenuItemType
    get() = js.reflect.unsafeCast("submenu")

inline val MenuItemType.Companion.checkbox: MenuItemType
    get() = js.reflect.unsafeCast("checkbox")

inline val MenuItemType.Companion.radio: MenuItemType
    get() = js.reflect.unsafeCast("radio")

inline val MenuItemType.Companion.header: MenuItemType
    get() = js.reflect.unsafeCast("header")

inline val MenuItemType.Companion.palette: MenuItemType
    get() = js.reflect.unsafeCast("palette")
