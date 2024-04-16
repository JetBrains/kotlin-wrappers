// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Disambiguation {
    companion object {
        @JsValue("compatible")
        val compatible: Overflow

        @JsValue("earlier")
        val earlier: Overflow

        @JsValue("later")
        val later: Overflow

        @JsValue("reject")
        val reject: Overflow
    }
}
