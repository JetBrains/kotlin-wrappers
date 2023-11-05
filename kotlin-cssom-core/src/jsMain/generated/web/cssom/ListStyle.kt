// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ListStyle {
    companion object {
        @JsValue("inside")
        val inside: ListStyle

        @JsValue("outside")
        val outside: ListStyle
    }
}
