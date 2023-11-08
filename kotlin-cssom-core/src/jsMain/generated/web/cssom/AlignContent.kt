// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AlignContent {
    companion object {
        @JsValue("space-around")
        val spaceAround: AlignContent

        @JsValue("space-between")
        val spaceBetween: AlignContent

        @JsValue("space-evenly")
        val spaceEvenly: AlignContent

        @JsValue("stretch")
        val stretch: AlignContent

        @JsValue("center")
        val center: AlignContent

        @JsValue("end")
        val end: AlignContent

        @JsValue("flex-end")
        val flexEnd: AlignContent

        @JsValue("flex-start")
        val flexStart: AlignContent

        @JsValue("start")
        val start: AlignContent

        @JsValue("baseline")
        val baseline: AlignContent

        @JsValue("normal")
        val normal: AlignContent
    }
}
