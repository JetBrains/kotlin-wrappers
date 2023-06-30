package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', hidden: 'hidden', hiddenInset: 'hiddenInset', customButtonsOnHover: 'customButtonsOnHover'}/*union*/)""")
sealed external interface BrowserWindowConstructorOptionsTitleBarStyle {
    companion object {
        val default: BrowserWindowConstructorOptionsTitleBarStyle
        val hidden: BrowserWindowConstructorOptionsTitleBarStyle
        val hiddenInset: BrowserWindowConstructorOptionsTitleBarStyle
        val customButtonsOnHover: BrowserWindowConstructorOptionsTitleBarStyle
    }
}
