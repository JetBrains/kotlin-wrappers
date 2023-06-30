package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{normal: 'normal', separator: 'separator', submenu: 'submenu', checkbox: 'checkbox', radio: 'radio'}/*union*/)""")
sealed external interface MenuItemType {
    companion object {
        val normal: MenuItemType
        val separator: MenuItemType
        val submenu: MenuItemType
        val checkbox: MenuItemType
        val radio: MenuItemType
    }
}
