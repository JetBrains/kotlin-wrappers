// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface ColorInterpolation {
    companion object {
        @JsValue("linearRGB")
        val linearRGB: ColorInterpolation

        @JsValue("sRGB")
        val sRGB: ColorInterpolation
    }
}
