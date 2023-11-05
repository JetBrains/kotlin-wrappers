// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.capabilities

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ColorGamut {
    companion object {
        @JsValue("p3")
        val p3: ColorGamut

        @JsValue("rec2020")
        val rec2020: ColorGamut

        @JsValue("srgb")
        val srgb: ColorGamut
    }
}
