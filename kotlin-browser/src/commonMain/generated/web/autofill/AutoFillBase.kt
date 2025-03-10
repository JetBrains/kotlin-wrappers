// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.autofill

import seskar.js.JsValue

sealed external interface AutoFillBase :
    AutoFill {
    companion object {
        @JsValue("")
        val none: AutoFillBase

        @JsValue("off")
        val off: AutoFillBase

        @JsValue("on")
        val on: AutoFillBase
    }
}
