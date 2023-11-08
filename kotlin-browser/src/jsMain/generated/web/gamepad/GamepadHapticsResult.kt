// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GamepadHapticsResult {
    companion object {
        @JsValue("complete")
        val complete: GamepadHapticsResult

        @JsValue("preempted")
        val preempted: GamepadHapticsResult
    }
}
