// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import js.reflect.unsafeCast

sealed external interface GamepadHapticEffectType {
    companion object
}

inline val GamepadHapticEffectType.Companion.dualRumble: GamepadHapticEffectType
    get() = unsafeCast("dualRumble")

inline val GamepadHapticEffectType.Companion.triggerRumble: GamepadHapticEffectType
    get() = unsafeCast("triggerRumble")
