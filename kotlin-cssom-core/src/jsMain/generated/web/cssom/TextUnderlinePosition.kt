// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TextUnderlinePosition {
    companion object {
        @JsValue("from-font")
        val fromFont: TextUnderlinePosition

        @JsValue("left")
        val left: TextUnderlinePosition

        @JsValue("right")
        val right: TextUnderlinePosition

        @JsValue("under")
        val under: TextUnderlinePosition
    }
}
