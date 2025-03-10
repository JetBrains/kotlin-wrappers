// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.autofill

import seskar.js.JsValue

sealed external interface AutoFillAddressKind {
    companion object {
        @JsValue("billing")
        val billing: AutoFillAddressKind

        @JsValue("shipping")
        val shipping: AutoFillAddressKind
    }
}
