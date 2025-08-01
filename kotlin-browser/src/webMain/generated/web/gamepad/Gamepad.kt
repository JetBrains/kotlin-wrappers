// Automatically generated - do not modify!

package web.gamepad

import js.array.ReadonlyArray
import js.core.JsDouble
import web.time.DOMHighResTimeStamp

/**
 * The **`Gamepad`** interface of the Gamepad API defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad)
 */
open external class Gamepad
private constructor() {
    /**
     * The **`Gamepad.axes`** property of the Gamepad interface returns an array representing the controls with axes present on the device (e.g., analog thumb sticks).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/axes)
     */
    val axes: ReadonlyArray<JsDouble>

    /**
     * The **`buttons`** property of the Gamepad interface returns an array of GamepadButton objects representing the buttons present on the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/buttons)
     */
    val buttons: ReadonlyArray<GamepadButton>

    /**
     * The **`Gamepad.connected`** property of the Gamepad interface returns a boolean indicating whether the gamepad is still connected to the system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/connected)
     */
    val connected: Boolean

    /**
     * The **`Gamepad.id`** property of the Gamepad interface returns a string containing some information about the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/id)
     */
    val id: String

    /**
     * The **`Gamepad.index`** property of the Gamepad interface returns an integer that is auto-incremented to be unique for each device currently connected to the system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/index)
     */
    val index: Int

    /**
     * The **`Gamepad.mapping`** property of the Gamepad interface returns a string indicating whether the browser has remapped the controls on the device to a known layout.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping)
     */
    val mapping: GamepadMappingType

    /**
     * The **`Gamepad.timestamp`** property of the Gamepad interface returns a DOMHighResTimeStamp representing the last time the data for this gamepad was updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/timestamp)
     */
    val timestamp: DOMHighResTimeStamp

    /**
     * The **`vibrationActuator`** read-only property of the Gamepad interface returns a GamepadHapticActuator object, which represents haptic feedback hardware available on the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/vibrationActuator)
     */
    val vibrationActuator: GamepadHapticActuator
}
