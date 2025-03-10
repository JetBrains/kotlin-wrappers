// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gamepad

import seskar.js.JsValue

sealed external interface GamepadHapticsResult {
    companion object {
        @JsValue("complete")
        val complete: GamepadHapticsResult

        @JsValue("preempted")
        val preempted: GamepadHapticsResult
    }
}
