// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface JustifyContent {
    companion object {
        @JsValue("space-around")
        val spaceAround: JustifyContent

        @JsValue("space-between")
        val spaceBetween: JustifyContent

        @JsValue("space-evenly")
        val spaceEvenly: JustifyContent

        @JsValue("stretch")
        val stretch: JustifyContent

        @JsValue("center")
        val center: JustifyContent

        @JsValue("end")
        val end: JustifyContent

        @JsValue("flex-end")
        val flexEnd: JustifyContent

        @JsValue("flex-start")
        val flexStart: JustifyContent

        @JsValue("start")
        val start: JustifyContent

        @JsValue("left")
        val left: JustifyContent

        @JsValue("normal")
        val normal: JustifyContent

        @JsValue("right")
        val right: JustifyContent
    }
}
