// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface BreakInside {
    companion object {
        @JsValue("avoid")
        val avoid: BreakInside

        @JsValue("avoid-column")
        val avoidColumn: BreakInside

        @JsValue("avoid-page")
        val avoidPage: BreakInside

        @JsValue("avoid-region")
        val avoidRegion: BreakInside
    }
}
