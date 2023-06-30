package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{rawKeyDown: 'rawKeyDown', keyDown: 'keyDown', keyUp: 'keyUp', char: 'char'}/*union*/)""")
sealed external interface KeyboardInputEventType {
    companion object {
        val rawKeyDown: KeyboardInputEventType
        val keyDown: KeyboardInputEventType
        val keyUp: KeyboardInputEventType
        val char: KeyboardInputEventType
    }
}
