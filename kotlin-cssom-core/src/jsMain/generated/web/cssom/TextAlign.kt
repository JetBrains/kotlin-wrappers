// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextAlign {
    companion object {
        @JsValue("center")
        val center: TextAlign

        @JsValue("end")
        val end: TextAlign

        @JsValue("justify")
        val justify: TextAlign

        @JsValue("left")
        val left: TextAlign

        @JsValue("match-parent")
        val matchParent: TextAlign

        @JsValue("right")
        val right: TextAlign

        @JsValue("start")
        val start: TextAlign
    }
}
