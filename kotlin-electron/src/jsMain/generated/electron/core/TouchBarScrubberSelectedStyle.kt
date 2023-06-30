package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{background: 'background', outline: 'outline', none: 'none'}/*union*/)""")
sealed external interface TouchBarScrubberSelectedStyle {
    companion object {
        val background: TouchBarScrubberSelectedStyle
        val outline: TouchBarScrubberSelectedStyle
        val none: TouchBarScrubberSelectedStyle
    }
}
