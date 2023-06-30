package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{shift: 'shift', control: 'control', ctrl: 'ctrl', alt: 'alt', meta: 'meta', command: 'command', cmd: 'cmd', isKeypad: 'isKeypad', isAutoRepeat: 'isAutoRepeat', leftButtonDown: 'leftButtonDown', middleButtonDown: 'middleButtonDown', rightButtonDown: 'rightButtonDown', capsLock: 'capsLock', numLock: 'numLock', left: 'left', right: 'right'}/*union*/)""")
sealed external interface InputEventModifier {
    companion object {
        val shift: InputEventModifier
        val control: InputEventModifier
        val ctrl: InputEventModifier
        val alt: InputEventModifier
        val meta: InputEventModifier
        val command: InputEventModifier
        val cmd: InputEventModifier
        val isKeypad: InputEventModifier
        val isAutoRepeat: InputEventModifier
        val leftButtonDown: InputEventModifier
        val middleButtonDown: InputEventModifier
        val rightButtonDown: InputEventModifier
        val capsLock: InputEventModifier
        val numLock: InputEventModifier
        val left: InputEventModifier
        val right: InputEventModifier
    }
}
