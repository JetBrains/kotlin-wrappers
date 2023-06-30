package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{left: 'left', right: 'right', overlay: 'overlay'}/*union*/)""")
sealed external interface TouchBarButtonIconPosition {
    companion object {
        val left: TouchBarButtonIconPosition
        val right: TouchBarButtonIconPosition
        val overlay: TouchBarButtonIconPosition
    }
}
