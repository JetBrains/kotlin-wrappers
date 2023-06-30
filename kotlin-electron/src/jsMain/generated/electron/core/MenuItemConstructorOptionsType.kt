package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{normal: 'normal', separator: 'separator', submenu: 'submenu', checkbox: 'checkbox', radio: 'radio'}/*union*/)""")
sealed external interface MenuItemConstructorOptionsType {
    companion object {
        val normal: MenuItemConstructorOptionsType
        val separator: MenuItemConstructorOptionsType
        val submenu: MenuItemConstructorOptionsType
        val checkbox: MenuItemConstructorOptionsType
        val radio: MenuItemConstructorOptionsType
    }
}
