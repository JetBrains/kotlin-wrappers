// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BoxSizing {
    companion object {
        @JsValue("border-box")
        val borderBox: BoxSizing

        @JsValue("content-box")
        val contentBox: BoxSizing
    }
}
