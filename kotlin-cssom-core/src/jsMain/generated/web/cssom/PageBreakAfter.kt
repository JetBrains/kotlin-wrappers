// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PageBreakAfter {
    companion object {
        @JsValue("always")
        val always: PageBreakAfter

        @JsValue("avoid")
        val avoid: PageBreakAfter

        @JsValue("left")
        val left: PageBreakAfter

        @JsValue("recto")
        val recto: PageBreakAfter

        @JsValue("right")
        val right: PageBreakAfter

        @JsValue("verso")
        val verso: PageBreakAfter
    }
}
