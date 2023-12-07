// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WhiteSpaceTrim {
    companion object {
        @JsValue("discard-after")
        val discardAfter: WhiteSpaceTrim

        @JsValue("discard-before")
        val discardBefore: WhiteSpaceTrim

        @JsValue("discard-inner")
        val discardInner: WhiteSpaceTrim
    }
}
