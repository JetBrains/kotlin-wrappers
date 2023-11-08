// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PlaceContent {
    companion object {
        @JsValue("space-around")
        val spaceAround: PlaceContent

        @JsValue("space-between")
        val spaceBetween: PlaceContent

        @JsValue("space-evenly")
        val spaceEvenly: PlaceContent

        @JsValue("stretch")
        val stretch: PlaceContent

        @JsValue("center")
        val center: PlaceContent

        @JsValue("end")
        val end: PlaceContent

        @JsValue("flex-end")
        val flexEnd: PlaceContent

        @JsValue("flex-start")
        val flexStart: PlaceContent

        @JsValue("start")
        val start: PlaceContent

        @JsValue("baseline")
        val baseline: PlaceContent

        @JsValue("normal")
        val normal: PlaceContent
    }
}
