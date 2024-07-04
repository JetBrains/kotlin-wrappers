// Automatically generated - do not modify!

package web.gamepad

import js.promise.Promise
import seskar.js.JsAsync

/**
 * This Gamepad API interface represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator)
 */
sealed external class GamepadHapticActuator {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/playEffect)
     */
    @JsAsync
    suspend fun playEffect(
        type: GamepadHapticEffectType,
        params: GamepadEffectParameters = definedExternally,
    ): GamepadHapticsResult

    @JsName("playEffect")
    fun playEffectAsync(
        type: GamepadHapticEffectType,
        params: GamepadEffectParameters = definedExternally,
    ): Promise<GamepadHapticsResult>

    @JsAsync
    suspend fun reset(): GamepadHapticsResult

    @JsName("reset")
    fun resetAsync(): Promise<GamepadHapticsResult>
}
