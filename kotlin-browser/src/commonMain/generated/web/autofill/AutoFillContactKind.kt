// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
