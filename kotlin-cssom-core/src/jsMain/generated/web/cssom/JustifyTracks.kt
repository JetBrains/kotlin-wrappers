// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface JustifyTracks {
    companion object {
        @JsValue("space-around")
        val spaceAround: JustifyTracks

        @JsValue("space-between")
        val spaceBetween: JustifyTracks

        @JsValue("space-evenly")
        val spaceEvenly: JustifyTracks

        @JsValue("stretch")
        val stretch: JustifyTracks

        @JsValue("center")
        val center: JustifyTracks

        @JsValue("end")
        val end: JustifyTracks

        @JsValue("flex-end")
        val flexEnd: JustifyTracks

        @JsValue("flex-start")
        val flexStart: JustifyTracks

        @JsValue("start")
        val start: JustifyTracks

        @JsValue("left")
        val left: JustifyTracks

        @JsValue("normal")
        val normal: JustifyTracks

        @JsValue("right")
        val right: JustifyTracks
    }
}
