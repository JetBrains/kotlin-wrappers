// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
