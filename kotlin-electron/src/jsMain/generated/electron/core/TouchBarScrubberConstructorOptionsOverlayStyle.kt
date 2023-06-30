package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{background: 'background', outline: 'outline', none: 'none'}/*union*/)""")
sealed external interface TouchBarScrubberConstructorOptionsOverlayStyle {
    companion object {
        val background: TouchBarScrubberConstructorOptionsOverlayStyle
        val outline: TouchBarScrubberConstructorOptionsOverlayStyle
        val none: TouchBarScrubberConstructorOptionsOverlayStyle
    }
}
