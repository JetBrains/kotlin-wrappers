// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface MaskComposite {
    companion object {
        @JsValue("add")
        val add: MaskComposite

        @JsValue("exclude")
        val exclude: MaskComposite

        @JsValue("intersect")
        val intersect: MaskComposite

        @JsValue("subtract")
        val subtract: MaskComposite
    }
}
