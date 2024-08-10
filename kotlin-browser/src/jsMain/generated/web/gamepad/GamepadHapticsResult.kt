// Automatically generated - do not modify!

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
