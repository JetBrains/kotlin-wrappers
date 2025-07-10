// Automatically generated - do not modify!

package web.gamepad

import js.promise.Promise
import js.promise.await
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
 * The **`playEffect()`** method of the GamepadHapticActuator interface causes the hardware to play a specific vibration effect.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/playEffect)
 */
suspend inline fun GamepadHapticActuator.playEffect(
    type: GamepadHapticEffectType,
    params: GamepadEffectParameters,
): GamepadHapticsResult {
    return playEffectAsync(
        type = type,
        params = params
    ).await()
}

/**
 * The **`playEffect()`** method of the GamepadHapticActuator interface causes the hardware to play a specific vibration effect.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/playEffect)
 */
suspend inline fun GamepadHapticActuator.playEffect(
    type: GamepadHapticEffectType,
): GamepadHapticsResult {
    return playEffectAsync(type = type).await()
}

/**
 * The **`reset()`** method of the GamepadHapticActuator interface stops the hardware from playing an active vibration effect.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/reset)
 */
suspend inline fun GamepadHapticActuator.reset(): GamepadHapticsResult {
    return resetAsync().await()
}
