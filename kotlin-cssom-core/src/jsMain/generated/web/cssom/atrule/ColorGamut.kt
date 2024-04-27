// Automatically generated - do not modify!

package web.cssom.atrule

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ColorGamut {
    companion object {
        @JsValue("srgb")
        val srgb: ColorGamut

        @JsValue("p3")
        val p3: ColorGamut

        @JsValue("rec2020")
        val rec2020: ColorGamut
    }
}
