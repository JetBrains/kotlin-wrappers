// Automatically generated - do not modify!

package web.gamepad

/**
 * The **`GamepadButton`** interface defines an individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton)
 */
external class GamepadButton
private constructor() {
    /**
     * The **`GamepadButton.pressed`** property of the the button is currently pressed (`true`) or unpressed (`false`).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/pressed)
     */
    val pressed: Boolean

    /**
     * The **`touched`** property of the a button capable of detecting touch is currently touched (`true`) or not touched (`false`).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/touched)
     */
    val touched: Boolean

    /**
     * The **`GamepadButton.value`** property of the current state of analog buttons on many modern gamepads, such as the triggers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/value)
     */
    val value: Double
}
