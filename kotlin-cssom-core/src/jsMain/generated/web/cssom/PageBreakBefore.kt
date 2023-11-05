// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PageBreakBefore {
    companion object {
        @JsValue("always")
        val always: PageBreakBefore

        @JsValue("avoid")
        val avoid: PageBreakBefore

        @JsValue("left")
        val left: PageBreakBefore

        @JsValue("recto")
        val recto: PageBreakBefore

        @JsValue("right")
        val right: PageBreakBefore

        @JsValue("verso")
        val verso: PageBreakBefore
    }
}
