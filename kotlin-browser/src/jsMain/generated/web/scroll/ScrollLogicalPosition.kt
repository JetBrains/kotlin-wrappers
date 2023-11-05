// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.scroll

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ScrollLogicalPosition {
    companion object {
        @JsValue("center")
        val center: ScrollLogicalPosition

        @JsValue("end")
        val end: ScrollLogicalPosition

        @JsValue("nearest")
        val nearest: ScrollLogicalPosition

        @JsValue("start")
        val start: ScrollLogicalPosition
    }
}
