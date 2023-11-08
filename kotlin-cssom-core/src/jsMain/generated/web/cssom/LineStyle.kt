// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface LineStyle : LineStyleProperty {
    companion object {
        @JsValue("dashed")
        val dashed: LineStyle

        @JsValue("dotted")
        val dotted: LineStyle

        @JsValue("double")
        val double: LineStyle

        @JsValue("groove")
        val groove: LineStyle

        @JsValue("hidden")
        val hidden: LineStyle

        @JsValue("inset")
        val inset: LineStyle

        @JsValue("outset")
        val outset: LineStyle

        @JsValue("ridge")
        val ridge: LineStyle

        @JsValue("solid")
        val solid: LineStyle
    }
}
