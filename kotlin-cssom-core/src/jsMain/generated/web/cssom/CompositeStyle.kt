// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CompositeStyle {
    companion object {
        @JsValue("clear")
        val clear: CompositeStyle

        @JsValue("copy")
        val copy: CompositeStyle

        @JsValue("destination-atop")
        val destinationAtop: CompositeStyle

        @JsValue("destination-in")
        val destinationIn: CompositeStyle

        @JsValue("destination-out")
        val destinationOut: CompositeStyle

        @JsValue("destination-over")
        val destinationOver: CompositeStyle

        @JsValue("source-atop")
        val sourceAtop: CompositeStyle

        @JsValue("source-in")
        val sourceIn: CompositeStyle

        @JsValue("source-out")
        val sourceOut: CompositeStyle

        @JsValue("source-over")
        val sourceOver: CompositeStyle

        @JsValue("xor")
        val xor: CompositeStyle
    }
}
