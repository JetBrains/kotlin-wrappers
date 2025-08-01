// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import js.reflect.unsafeCast

sealed external interface GamepadHapticsResult {
    companion object
}

inline val GamepadHapticsResult.Companion.complete: GamepadHapticsResult
    get() = unsafeCast("complete")

inline val GamepadHapticsResult.Companion.preempted: GamepadHapticsResult
    get() = unsafeCast("preempted")
