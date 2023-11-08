// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RubyAlign {
    companion object {
        @JsValue("center")
        val center: RubyAlign

        @JsValue("space-around")
        val spaceAround: RubyAlign

        @JsValue("space-between")
        val spaceBetween: RubyAlign

        @JsValue("start")
        val start: RubyAlign
    }
}
