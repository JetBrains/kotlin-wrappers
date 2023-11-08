// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Overflow {
    companion object {
        @JsValue("clip")
        val clip: Overflow

        @JsValue("hidden")
        val hidden: Overflow

        @JsValue("scroll")
        val scroll: Overflow

        @JsValue("visible")
        val visible: Overflow
    }
}
