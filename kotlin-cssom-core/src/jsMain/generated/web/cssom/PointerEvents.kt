// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PointerEvents {
    companion object {
        @JsValue("all")
        val all: PointerEvents

        @JsValue("fill")
        val fill: PointerEvents

        @JsValue("painted")
        val painted: PointerEvents

        @JsValue("stroke")
        val stroke: PointerEvents

        @JsValue("visible")
        val visible: PointerEvents

        @JsValue("visibleFill")
        val visibleFill: PointerEvents

        @JsValue("visiblePainted")
        val visiblePainted: PointerEvents

        @JsValue("visibleStroke")
        val visibleStroke: PointerEvents
    }
}
