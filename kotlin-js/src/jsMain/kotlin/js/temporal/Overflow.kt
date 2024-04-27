// Automatically generated - do not modify!

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
