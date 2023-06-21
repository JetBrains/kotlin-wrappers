// Automatically generated - do not modify!

package web.gamepad

import kotlin.js.Promise

sealed external class GamepadHapticActuator {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/type) */
    val type: GamepadHapticActuatorType
    fun playEffect(
        type: GamepadHapticEffectType,
        params: GamepadEffectParameters = definedExternally,
    ): Promise<GamepadHapticsResult>

    fun reset(): Promise<GamepadHapticsResult>
}
