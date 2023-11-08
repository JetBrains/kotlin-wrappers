// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CanvasDirection {
    companion object {
        @JsValue("inherit")
        val inherit: CanvasDirection

        @JsValue("ltr")
        val ltr: CanvasDirection

        @JsValue("rtl")
        val rtl: CanvasDirection
    }
}
