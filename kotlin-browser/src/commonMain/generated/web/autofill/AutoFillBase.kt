// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
