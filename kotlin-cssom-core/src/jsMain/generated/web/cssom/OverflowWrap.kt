// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface OverflowWrap {
    companion object {
        @JsValue("anywhere")
        val anywhere: OverflowWrap

        @JsValue("break-word")
        val breakWord: OverflowWrap

        @JsValue("normal")
        val normal: OverflowWrap
    }
}
