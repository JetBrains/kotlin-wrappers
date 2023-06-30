package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{left: 'left', middle: 'middle', right: 'right'}/*union*/)""")
sealed external interface MouseInputEventButton {
    companion object {
        val left: MouseInputEventButton
        val middle: MouseInputEventButton
        val right: MouseInputEventButton
    }
}
