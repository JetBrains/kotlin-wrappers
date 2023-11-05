// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface BreakBefore {
    companion object {
        @JsValue("all")
        val all: BreakBefore

        @JsValue("always")
        val always: BreakBefore

        @JsValue("avoid")
        val avoid: BreakBefore

        @JsValue("avoid-column")
        val avoidColumn: BreakBefore

        @JsValue("avoid-page")
        val avoidPage: BreakBefore

        @JsValue("avoid-region")
        val avoidRegion: BreakBefore

        @JsValue("column")
        val column: BreakBefore

        @JsValue("left")
        val left: BreakBefore

        @JsValue("page")
        val page: BreakBefore

        @JsValue("recto")
        val recto: BreakBefore

        @JsValue("region")
        val region: BreakBefore

        @JsValue("right")
        val right: BreakBefore

        @JsValue("verso")
        val verso: BreakBefore
    }
}
