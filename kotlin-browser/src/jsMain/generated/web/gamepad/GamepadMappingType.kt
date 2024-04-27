// Automatically generated - do not modify!

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
