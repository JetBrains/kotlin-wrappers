// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
