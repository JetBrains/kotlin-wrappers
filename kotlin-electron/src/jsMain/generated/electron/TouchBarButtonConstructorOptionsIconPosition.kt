package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{left: 'left', right: 'right', overlay: 'overlay'}/*union*/)""")
sealed external interface TouchBarButtonConstructorOptionsIconPosition {
    companion object {
        val left: TouchBarButtonConstructorOptionsIconPosition
        val right: TouchBarButtonConstructorOptionsIconPosition
        val overlay: TouchBarButtonConstructorOptionsIconPosition
    }
}
