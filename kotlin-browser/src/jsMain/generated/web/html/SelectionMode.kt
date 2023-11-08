// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SelectionMode {
    companion object {
        @JsValue("end")
        val end: SelectionMode

        @JsValue("preserve")
        val preserve: SelectionMode

        @JsValue("select")
        val select: SelectionMode

        @JsValue("start")
        val start: SelectionMode
    }
}
