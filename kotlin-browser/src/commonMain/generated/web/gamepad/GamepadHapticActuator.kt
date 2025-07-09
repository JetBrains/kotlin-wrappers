// Automatically generated - do not modify!

package web.gamepad

import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`GamepadHapticActuator`** interface of the Gamepad API represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator)
 */
external class GamepadHapticActuator
private constructor() {
    /**
     * The **`playEffect()`** method of the GamepadHapticActuator interface causes the hardware to play a specific vibration effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/playEffect)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun playEffect(
        type: GamepadHapticEffectType,
        params: GamepadEffectParameters = definedExternally,
    ): GamepadHapticsResult

    @JsName("playEffect")
    fun playEffectAsync(
        type: GamepadHapticEffectType,
        params: GamepadEffectParameters = definedExternally,
    ): Promise<GamepadHapticsResult>

    /**
     * The **`reset()`** method of the GamepadHapticActuator interface stops the hardware from playing an active vibration effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/reset)
     */
    @JsName("reset")
    fun resetAsync(): Promise<GamepadHapticsResult>
}

/**
 * The **`reset()`** method of the GamepadHapticActuator interface stops the hardware from playing an active vibration effect.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/reset)
 */
suspend inline fun GamepadHapticActuator.reset(): GamepadHapticsResult {
    return awaitPromiseLike(resetAsync())
}
