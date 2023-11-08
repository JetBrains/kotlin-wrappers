// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AutoFillAddressKind {
    companion object {
        @JsValue("billing")
        val billing: AutoFillAddressKind

        @JsValue("shipping")
        val shipping: AutoFillAddressKind
    }
}
