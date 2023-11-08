// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PredefinedColorSpace {
    companion object {
        @JsValue("display-p3")
        val displayP3: PredefinedColorSpace

        @JsValue("srgb")
        val srgb: PredefinedColorSpace
    }
}
