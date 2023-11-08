// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Visibility {
    companion object {
        @JsValue("collapse")
        val collapse: Visibility

        @JsValue("hidden")
        val hidden: Visibility

        @JsValue("visible")
        val visible: Visibility
    }
}
