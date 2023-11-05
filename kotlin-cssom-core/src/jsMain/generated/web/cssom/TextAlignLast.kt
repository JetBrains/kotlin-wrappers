// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextAlignLast {
    companion object {
        @JsValue("center")
        val center: TextAlignLast

        @JsValue("end")
        val end: TextAlignLast

        @JsValue("justify")
        val justify: TextAlignLast

        @JsValue("left")
        val left: TextAlignLast

        @JsValue("right")
        val right: TextAlignLast

        @JsValue("start")
        val start: TextAlignLast
    }
}
