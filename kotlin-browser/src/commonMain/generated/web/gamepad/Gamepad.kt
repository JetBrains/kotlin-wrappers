// Automatically generated - do not modify!

package web.gamepad

import js.array.ReadonlyArray
import web.time.DOMHighResTimeStamp

/**
 * This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad)
 */
external class Gamepad
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/axes)
     */
    val axes: ReadonlyArray<Double>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/buttons)
     */
    val buttons: ReadonlyArray<GamepadButton>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/connected)
     */
    val connected: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/index)
     */
    val index: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping)
     */
    val mapping: GamepadMappingType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/timestamp)
     */
    val timestamp: DOMHighResTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/vibrationActuator)
     */
    val vibrationActuator: GamepadHapticActuator
}
