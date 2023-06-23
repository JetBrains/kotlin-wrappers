// Automatically generated - do not modify!

package web.gamepad

/**
 * An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton)
 */
sealed external class GamepadButton {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/pressed) */
    val pressed: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/touched) */
    val touched: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/value) */
    val value: Double
}
