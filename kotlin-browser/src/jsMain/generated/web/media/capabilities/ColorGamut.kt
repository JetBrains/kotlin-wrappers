// Automatically generated - do not modify!

package web.media.capabilities

import seskar.js.JsValue

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
