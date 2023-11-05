// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ScrollSnapAlign {
    companion object {
        @JsValue("center")
        val center: ScrollSnapAlign

        @JsValue("end")
        val end: ScrollSnapAlign

        @JsValue("start")
        val start: ScrollSnapAlign
    }
}
