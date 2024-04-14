// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Overflow {
    companion object {
        @JsValue("constrain")
        val constrain: Overflow

        @JsValue("reject")
        val reject: Overflow
    }
}
