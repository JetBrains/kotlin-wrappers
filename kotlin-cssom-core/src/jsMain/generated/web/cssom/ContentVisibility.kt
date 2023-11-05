// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ContentVisibility {
    companion object {
        @JsValue("hidden")
        val hidden: ContentVisibility

        @JsValue("visible")
        val visible: ContentVisibility
    }
}
