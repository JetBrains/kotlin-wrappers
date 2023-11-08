// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TouchAction {
    companion object {
        @JsValue("manipulation")
        val manipulation: TouchAction

        @JsValue("pan-down")
        val panDown: TouchAction

        @JsValue("pan-left")
        val panLeft: TouchAction

        @JsValue("pan-right")
        val panRight: TouchAction

        @JsValue("pan-up")
        val panUp: TouchAction

        @JsValue("pan-x")
        val panX: TouchAction

        @JsValue("pan-y")
        val panY: TouchAction

        @JsValue("pinch-zoom")
        val pinchZoom: TouchAction
    }
}
