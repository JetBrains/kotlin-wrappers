// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface PositionVisibility {
    companion object {
        @JsValue("always")
        val always: PositionVisibility

        @JsValue("anchors-valid")
        val anchorsValid: PositionVisibility

        @JsValue("anchors-visible")
        val anchorsVisible: PositionVisibility

        @JsValue("no-overflow")
        val noOverflow: PositionVisibility
    }
}
