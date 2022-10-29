// Automatically generated - do not modify!

package web.gamepad

import kotlinx.js.HighResTimeStamp
import kotlinx.js.ReadonlyArray

sealed external class Gamepad {
    val axes: ReadonlyArray<Double>
    val buttons: ReadonlyArray<GamepadButton>
    val connected: Boolean
    val hapticActuators: ReadonlyArray<GamepadHapticActuator>
    val id: String
    val index: Int
    val mapping: GamepadMappingType
    val timestamp: HighResTimeStamp
}
