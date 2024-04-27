// Automatically generated - do not modify!

package web.autofill

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
