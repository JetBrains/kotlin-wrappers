// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Pointer {
    companion object {
        @JsValue("none")
        val none: Pointer

        @JsValue("coarse")
        val coarse: Pointer

        @JsValue("fine")
        val fine: Pointer
    }
}
