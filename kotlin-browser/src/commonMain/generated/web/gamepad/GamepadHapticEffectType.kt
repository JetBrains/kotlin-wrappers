// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import seskar.js.JsValue

sealed external interface GamepadHapticEffectType {
    companion object {
        @JsValue("dual-rumble")
        val dualRumble: GamepadHapticEffectType

        @JsValue("trigger-rumble")
        val triggerRumble: GamepadHapticEffectType
    }
}
