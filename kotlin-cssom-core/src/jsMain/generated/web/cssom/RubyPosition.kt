// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RubyPosition {
    companion object {
        @JsValue("alternate")
        val alternate: RubyPosition

        @JsValue("inter-character")
        val interCharacter: RubyPosition

        @JsValue("over")
        val over: RubyPosition

        @JsValue("under")
        val under: RubyPosition
    }
}
