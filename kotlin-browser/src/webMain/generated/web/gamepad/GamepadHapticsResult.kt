// Automatically generated - do not modify!

package web.gamepad

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GamepadHapticsResult

inline val GamepadHapticsResult.Companion.complete: GamepadHapticsResult
    get() = unsafeCast("complete")

inline val GamepadHapticsResult.Companion.preempted: GamepadHapticsResult
    get() = unsafeCast("preempted")
