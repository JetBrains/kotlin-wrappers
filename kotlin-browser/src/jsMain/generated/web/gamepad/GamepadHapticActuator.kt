// Automatically generated - do not modify!

package web.gamepad

import kotlin.js.Promise

/**
 * This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator)
 */
sealed external class GamepadHapticActuator {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/type) */
    val type: GamepadHapticActuatorType
    fun playEffect(
        type: GamepadHapticEffectType,
        params: GamepadEffectParameters = definedExternally,
    ): Promise<GamepadHapticsResult>

    fun reset(): Promise<GamepadHapticsResult>
}
