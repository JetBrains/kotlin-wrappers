// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ButtonType {
    companion object {
        @JsValue("submit")
        val submit: ButtonType

        @JsValue("reset")
        val reset: ButtonType

        @JsValue("button")
        val button: ButtonType
    }
}
