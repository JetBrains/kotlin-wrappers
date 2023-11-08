// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.virtual.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScrollAlignment {
    companion object {
        @JsValue("start")
        val start: ScrollAlignment

        @JsValue("center")
        val center: ScrollAlignment

        @JsValue("end")
        val end: ScrollAlignment

        @JsValue("auto")
        val auto: ScrollAlignment
    }
}
