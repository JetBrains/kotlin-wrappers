// Automatically generated - do not modify!

package web.gamepad

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GamepadHapticEffectType {
    companion object {
        @JsValue("dual-rumble")
        val dualRumble: GamepadHapticEffectType

        @JsValue("trigger-rumble")
        val triggerRumble: GamepadHapticEffectType
    }
}
