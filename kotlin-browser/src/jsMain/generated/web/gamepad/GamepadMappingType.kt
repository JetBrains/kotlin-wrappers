// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GamepadMappingType {
    companion object {
        @JsValue("")
        val none: GamepadMappingType

        @JsValue("standard")
        val standard: GamepadMappingType

        @JsValue("xr-standard")
        val xrStandard: GamepadMappingType
    }
}
