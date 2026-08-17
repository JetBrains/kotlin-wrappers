// Automatically generated - do not modify!

package web.gamepad

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GamepadHapticEffectType

inline val GamepadHapticEffectType.Companion.dualRumble: GamepadHapticEffectType
    get() = unsafeCast("dual-rumble")

inline val GamepadHapticEffectType.Companion.triggerRumble: GamepadHapticEffectType
    get() = unsafeCast("trigger-rumble")
