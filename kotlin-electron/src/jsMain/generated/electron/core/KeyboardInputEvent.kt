package electron.core


external interface KeyboardInputEvent : InputEvent {
// Docs: https://electronjs.org/docs/api/structures/keyboard-input-event
    /**
     * The character that will be sent as the keyboard event. Should only use the valid
     * key codes in Accelerator.
     */
    var keyCode: String

    /**
     * The type of the event, can be `rawKeyDown`, `keyDown`, `keyUp` or `char`.
     */
    @Deprecated(message = "use keyboardType", level = DeprecationLevel.HIDDEN)
    override var type: InputEventType

    @JsName("type")
    var keyboardType: (KeyboardInputEventType)
}
