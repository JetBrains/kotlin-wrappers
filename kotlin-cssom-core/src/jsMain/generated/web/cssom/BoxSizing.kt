// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface BoxSizing {
    companion object {
        @JsValue("border-box")
        val borderBox: BoxSizing

        @JsValue("content-box")
        val contentBox: BoxSizing
    }
}
