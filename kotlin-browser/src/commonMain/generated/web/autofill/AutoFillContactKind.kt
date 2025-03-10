// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.autofill

import seskar.js.JsValue

sealed external interface AutoFillContactKind {
    companion object {
        @JsValue("home")
        val home: AutoFillContactKind

        @JsValue("mobile")
        val mobile: AutoFillContactKind

        @JsValue("work")
        val work: AutoFillContactKind
    }
}
